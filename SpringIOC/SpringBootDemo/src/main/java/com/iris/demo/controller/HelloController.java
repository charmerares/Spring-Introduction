package com.iris.demo.controller;

import com.iris.demo.domain.Car;
import com.iris.demo.domain.Enginee;
import com.iris.demo.domain.Gear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Car car;

    @GetMapping("/first")
    public String test(){
        //创建对象
        Enginee enginee=new Enginee("红旗");
        Gear gear=new Gear("橡胶");
        Car car=new Car(enginee,gear);

//        Enginee enginee1=new Enginee("法拉利");
//        Gear gear1=new Gear("玛莎拉蒂");
//        Car car1=new Car(enginee,gear);
        //核心
        System.out.println(car.toString());
        return car.toString();
    }

    @GetMapping("/second")
    public String test1(){
        //核心功能
        System.out.println(car.toString());
        return car.toString();
    }
}
