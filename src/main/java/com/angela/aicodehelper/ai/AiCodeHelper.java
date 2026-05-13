package com.angela.aicodehelper.ai;

import dev.langchain4j.data.message.AiMessage;
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

    //简单对话
    public String chat(String message){
        UserMessage userMessage=UserMessage.from(message);
        ChatResponse chatResponse= qwenChatModel.chat(userMessage);
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
