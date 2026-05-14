package com.angela.aicodehelper.ai;

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
        //这里点进create可以看到反射创建AiService实现类
        return AiServices.create(AICodeHelperService.class,qwenChatModel);
    }
}
