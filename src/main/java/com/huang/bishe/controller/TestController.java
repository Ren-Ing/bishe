package com.huang.bishe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("login")
    public String login(){
        return "hello";
    }

    @RequestMapping("register")
    public String register(){
        return "login";
    }
}
