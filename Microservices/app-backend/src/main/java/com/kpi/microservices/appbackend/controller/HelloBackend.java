package com.kpi.microservices.appbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBackend {

    @RequestMapping("/")
    public String hello() {
        return "Hello Backend!";
    }
}

