package com.iris.SpringDemo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class aspect {
    private final String POINT_CUT="execution(* com.iris.SpringDemo.modules.ThirdBean.test())";

    @After(POINT_CUT)
    public void afterTest(){
        System.out.println("方法执行完毕");
    }

}
