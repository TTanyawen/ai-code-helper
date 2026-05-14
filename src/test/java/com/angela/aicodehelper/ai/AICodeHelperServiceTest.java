package com.angela.aicodehelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class AICodeHelperServiceTest {
    @Resource
    private AICodeHelperService aiCodeHelperService;
    @Test
    void chat() {
        String res = aiCodeHelperService.chat("请给我一个java的hello world程序");
        System.out.println(res);
    }
/*
當然可以啦！這是一個非常經典的開始學習Java的範例，讓我們來寫一個簡單的 "Hello, World!" 程序吧！

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

這個程序做了什麼呢？讓我來給你解說一下：

- `public class HelloWorld` 這行定義了一個名為 `HelloWorld` 的公共類別（class）。在Java中，所有的代碼都必須放在某個類別裡面。
- `public static void main(String[] args)` 是主方法（main method），每一個可執行的Java程序都需要有這麼一個入口點。當你運行這個程序時，就是從這裡開始執行的。
- `System.out.println("Hello, World!");` 這一行是打印出 "Hello, World!" 到控制台。`System.out.println()` 是一個內建的方法，用於輸出信息到屏幕。

如果你想要運行這個程序，你需要把上面的代碼保存成一個 `.java` 文件，比如叫做 `HelloWorld.java`，然後使用命令行工具編譯和運行它。記得哦，在編譯之前，確保你的環境已經安裝了JDK (Java Development Kit) 喔！

希望這能幫助到你！如果還有其他問題，隨時告訴我～ Let's keep coding and have fun! 🚀👩‍💻👨‍💻
 */

}