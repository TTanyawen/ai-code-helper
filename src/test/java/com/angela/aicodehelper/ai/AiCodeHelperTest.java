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

    @Test
    void chatWithMsg() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png")
        );
        aiCodeHelper.chatWithMsg(userMessage);
    }
}
