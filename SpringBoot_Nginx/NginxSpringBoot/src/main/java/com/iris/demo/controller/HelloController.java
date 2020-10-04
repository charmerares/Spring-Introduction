package com.iris.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String hello(HttpServletRequest req) {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String msg = "hello address: " + address.getHostAddress()+ " port: " + port;

        return msg;
    }
}
