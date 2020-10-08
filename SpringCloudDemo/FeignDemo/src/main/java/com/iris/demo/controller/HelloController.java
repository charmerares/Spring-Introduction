package com.iris.demo.controller;

import com.iris.demo.entity.HelloFeign;
import com.netflix.discovery.converters.Auto;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("feign-client")
    private HelloFeign helloFeign;
    @GetMapping("/hello")
    public String test(){
        return helloFeign.getHello();
    }
}
