package com.iris.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Enginee {
    private String name;

    public Enginee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enginee() {
        this.name = "橡胶";
    }

    @Override
    public String toString() {
        return "Gear{" +
                "name='" + name + '\'' +
                '}';
    }
}
