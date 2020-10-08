package com.iris.demo.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignFallback implements HelloFeign{
    @Override
    public String getHello() {
        return "Feign failed, please try later";
    }
}
