package com.iris.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/hello")
    public String test() {
        return "hello " + foo;
    }
}
