package com.example.mic1.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicController1 {

    @Autowired
    private Environment environment;

    @RequestMapping("getenv")
    public String status()
    {
        return "greetings from microservice1 working on port "+environment.getProperty("local.server.port");
    }
}
