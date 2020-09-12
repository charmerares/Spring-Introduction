package com.iris.demo.controller;

import com.iris.demo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/first")
    @ResponseBody
    private String hello(){
        Person person=new Person("jack","12345","12345@sina.com",23);
        return person.toString();
    }
}
