package com.kpi.microservices.appfrontend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFrontend {

    @RequestMapping("/")
    public String index() {
        return "Hello Frontend!";
    }

}
