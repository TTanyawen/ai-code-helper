<template>
  <div class="container">

    <h2>AI聊天</h2>

    <div class="chat-box">

      <div
        v-for="(item,index) in messages"
        :key="index"
        class="message"
      >
        {{ item }}
      </div>

    </div>

    <div class="input-area">

      <input
        v-model="inputMessage"
        placeholder="请输入内容..."
        @keyup.enter="sendMessage"
      />

      <button @click="sendMessage">
        发送
      </button>

    </div>

  </div>
</template>

<script setup>
import { ref } from "vue"

const inputMessage = ref("")
const messages = ref([])

// 后续可替换成动态创建的会话ID
const memoryId = ref(1)

// 保存当前连接
let eventSource = null

function sendMessage(){

    if(inputMessage.value.trim()===""){
        return
    }

    const userMessage=inputMessage.value

    // 用户消息加入聊天框
    messages.value.push(
        "用户：" + userMessage
    )

    // AI占位
    messages.value.push(
        "AI："
    )

    // AI消息所在索引
    const aiIndex=
        messages.value.length-1

    // 如果上一个流未结束
    if(eventSource){
        eventSource.close()
    }

    const url=
`http://localhost:8081/api/ai/chat?memoryId=${memoryId.value}&message=${encodeURIComponent(userMessage)}`

    eventSource=new EventSource(url)

    // 接收流式数据
    eventSource.onmessage=(event)=>{

        console.log(event.data)

        messages.value[aiIndex]+=event.data
    }

    // 结束连接
    eventSource.onerror=(error)=>{

        console.log("连接关闭")

        eventSource.close()
    }

    inputMessage.value=""
}
</script>

<style scoped>

.container{
    width:700px;
    margin:30px auto;
}

.chat-box{
    height:400px;
    border:1px solid #ddd;
    padding:15px;
    overflow-y:auto;
    margin-bottom:20px;
}

.message{
    margin:10px 0;
    line-height:1.8;
}

.input-area{
    display:flex;
}

input{
    flex:1;
    height:40px;
    padding-left:10px;
}

button{
    width:80px;
    margin-left:10px;
}
</style>