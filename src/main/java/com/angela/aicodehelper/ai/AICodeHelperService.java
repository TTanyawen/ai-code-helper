package com.angela.aicodehelper.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

/*
AiService的声明式的写法
以及
自动注入的写法(无需自己写工厂类注入Bean),只需要加@AiService注解使得类被扫描

但是,注解的方式牺牲灵活性,推荐使用工厂类注入的方式
 */
@AiService
public interface AICodeHelperService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String userMessage);
}
