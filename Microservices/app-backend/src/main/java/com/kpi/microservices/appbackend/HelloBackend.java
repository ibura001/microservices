package com.kpi.microservices.appbackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBackend {
    @RequestMapping("/")
    public String index() {
        return "Hello Backend!";
    }
}
