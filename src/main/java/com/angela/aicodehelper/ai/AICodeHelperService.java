package com.angela.aicodehelper.ai;

import dev.langchain4j.service.SystemMessage;
/*
AiService的声明式的写法
 */
public interface AICodeHelperService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String userMessage);
}
