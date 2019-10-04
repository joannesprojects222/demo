package com.example.feign.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mic1Controller {
    @Autowired
    Mic1 mic1;

    @RequestMapping("getenv")
    public String status()
    {
        System.out.println("inside feign");
        return mic1.getEnv();
    }
}
