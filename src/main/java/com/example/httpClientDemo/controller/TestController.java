package com.example.httpClientDemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author YZ
 * @Date 2020/4/1 16:29
 * @ClassName TestController
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/post/param")
    public String test(){
        System.out.println("请求成功");
        return UUID.randomUUID().toString();
    }
}
