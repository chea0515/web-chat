package com.ccfond.webchat.core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author chea0515@163.com
 */
@SpringBootApplication
public class ChatApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ChatApplication.class, args);
        ConfigurableEnvironment env = ctx.getEnvironment();
        String serPort = env.getProperty("server.port");
        System.out.println("服务已启动，端口: " + serPort);
    }
}
