package com.angela.aicodehelper.ai;

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
}
