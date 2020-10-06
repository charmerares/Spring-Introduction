package com.iris.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonTestController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://eureka-client/hello",String.class);
    }
}
