package com.ccfond.webchat.web;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author chea0515@163.com
 */
@MapperScan(basePackages = {"com.ccfond.webchat.**.dao"})
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.ccfond.webchat")
public class WebChatApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(WebChatApplication.class, args);
        ConfigurableEnvironment env = ctx.getEnvironment();
        String serPath = env.getProperty("server.servlet.context-path");
        String serPort = env.getProperty("server.port");
        System.out.println("服务已启动，上下文路径: " + serPath + ", 端口: " + serPort);
    }
}
