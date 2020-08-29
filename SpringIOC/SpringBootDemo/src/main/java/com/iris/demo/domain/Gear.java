package com.iris.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Gear {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gear(){
        this.name="橡胶";
    }
    public Gear(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gear{" +
                "name='" + name + '\'' +
                '}';
    }
}
