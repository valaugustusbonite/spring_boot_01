package com.springboot.practice.one.springboot01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }

}