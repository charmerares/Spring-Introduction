package com.iris.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Enginee enginee;
    private Gear gear;

    //    @Autowired
    public Car(Enginee enginee, Gear gear) {
        this.enginee = enginee;
        this.gear = gear;
    }

    public Enginee getEnginee() {
        return enginee;
    }

    public void setEnginee(Enginee enginee) {
        this.enginee = enginee;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "enginee=" + enginee +
                ", gear=" + gear +
                '}';
    }
}
