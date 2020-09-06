package com.iris.SpringDemo.config;

import com.iris.SpringDemo.modules.FirstBean;
import com.iris.SpringDemo.modules.ThirdBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ThirdBean thirdBean(){
        return new ThirdBean();
    }
}
