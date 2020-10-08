package com.iris.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonTestController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "error")
    public String test(){
        return restTemplate.getForObject("http://eureka-client/hello",String.class);
    }

    public String error(){
        return "sorry, the service cannot arrive!";
    }
}
