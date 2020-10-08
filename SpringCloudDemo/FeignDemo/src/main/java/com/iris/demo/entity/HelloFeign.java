package com.iris.demo.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "eureka-client",fallback = HelloFeignFallback.class)
@Qualifier("feign-client")
public interface HelloFeign {
    @GetMapping("/hello")
    String getHello();
}
