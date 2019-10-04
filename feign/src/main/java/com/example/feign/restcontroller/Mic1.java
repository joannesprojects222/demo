package com.example.feign.restcontroller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "mic1")
public interface Mic1 {
    @RequestMapping("getenv")
    public String getEnv();
}
