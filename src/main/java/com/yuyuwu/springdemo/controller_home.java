package com.yuyuwu.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller_home
{
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello, my name is Jim";
    }
}
