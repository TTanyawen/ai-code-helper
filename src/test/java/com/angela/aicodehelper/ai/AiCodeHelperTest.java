package com.angela.aicodehelper.ai;

import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AiCodeHelperTest {
    @Autowired
    private AiCodeHelper aiCodeHelper;

    @Test
    void chat(){
        aiCodeHelper.chat("你好，我是程序员Angela");
    }
    /*
    2026-05-13T19:50:44.077+08:00  INFO 28816 --- [ai-code-helper] [           main] c.angela.aicodehelper.ai.AiCodeHelper    : aiMessage:AiMessage { text = "嗨嗨，Angela！超開心遇到你呀！作為一個程式設計師，你現在是在尋找新的學習路徑、需要一些專案靈感，還是準備面試呢？不管哪一種情況，我都樂於助你一臂之力哦！Let's make your coding journey super exciting and fruitful! 🚀👩‍💻✨
    對了，如果你有任何具體的問題或目標，記得告訴我更多細節，這樣我能更精準地給出建議喲！期待聽到你的下一步計劃啦！😉" toolExecutionRequests = [] }
     */

    @Test
    void chatWithMsg() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png")
        );
        aiCodeHelper.chatWithMsg(userMessage);
    }
}
