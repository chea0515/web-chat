package com.ccfond.webchat.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author chea0515@163.com
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class WebChatApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(WebChatApplication.class, args);
        ConfigurableEnvironment env = ctx.getEnvironment();
        String serPort = env.getProperty("server.port");
        System.out.println("服务已启动，端口: " + serPort);
    }
}
