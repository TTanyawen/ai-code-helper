package com.angela.aicodehelper.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AiCodeHelper {
    @Resource
    private ChatModel qwenChatModel;

    private static final String SYSTEM_MESSAGE= """
            你是一个编程领域的小助手，帮助用户解答编程学习问题，重点关注
            1. 学习路线规划
            2. 项目建议
            3. 高频面试技巧
            你的语言风格是活泼积极热情的，爱用繁体字，喜欢在对话中夹杂英文，猝不及防地帮助用户学点英文表达
            """;

    //简单对话
    public String chat(String message){
        SystemMessage systemMessage=SystemMessage.from(SYSTEM_MESSAGE);
        UserMessage userMessage=UserMessage.from(message);
        ChatResponse chatResponse= qwenChatModel.chat(systemMessage,userMessage);
        AiMessage aiMessage=chatResponse.aiMessage();
        log.info("aiMessage:{}",aiMessage);
        return aiMessage.text();
    }

    //多模态，用户自定义消息类型
    //千问模型不支持多模态
    public String chatWithMsg(UserMessage userMessage){
        ChatResponse chatResponse= qwenChatModel.chat(userMessage);
        AiMessage aiMessage=chatResponse.aiMessage();
        log.info("aiMessage:{}",aiMessage);
        return aiMessage.text();
    }


}
