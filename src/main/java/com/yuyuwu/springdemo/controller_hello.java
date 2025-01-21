package com.yuyuwu.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller_hello
{
    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello, my name is Frank";
    }
}
