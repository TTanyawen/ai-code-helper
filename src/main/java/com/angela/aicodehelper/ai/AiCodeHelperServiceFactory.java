package com.angela.aicodehelper.ai;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiCodeHelperServiceFactory {
    @Resource
    private ChatModel qwenChatModel;
    @Bean
    public AICodeHelperService AiCodeHelperService(){
        //会话记忆
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        AICodeHelperService aiCodeHelperService = AiServices.builder(AICodeHelperService.class)
                .chatModel(qwenChatModel)
                .chatMemory(chatMemory)//会话记忆
                .build();
        return aiCodeHelperService;
    }
}
