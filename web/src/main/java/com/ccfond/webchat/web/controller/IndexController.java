package com.ccfond.webchat.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController extends BaseController {

    @GetMapping
    public String indexPage() {
        LOGGER.info("index 页面请求");
        return "{\"code\":0, \"data\": \"index\"}";
    }
}
