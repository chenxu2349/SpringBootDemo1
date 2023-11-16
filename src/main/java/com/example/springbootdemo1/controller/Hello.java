package com.example.springbootdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Hello
 * @Description
 * @Author chenxu
 * @Date 2023/11/15 18:38
 **/
@Controller
public class Hello {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello jenkins 444";
    }
}
