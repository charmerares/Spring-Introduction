package com.iris.SpringDemo;

import com.iris.SpringDemo.modules.FirstBean;
import com.iris.SpringDemo.modules.SecondBean;
import com.iris.SpringDemo.modules.ThirdBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:application.xml");
        Object firstBean = context.getBean("firstBean");
        ((FirstBean)firstBean).test();

        Object secondBean = context.getBean("secondBean");
        ((SecondBean)secondBean).test();

        Object thirdBean = context.getBean("thirdBean");
        ((ThirdBean)thirdBean).test();
    }
}
