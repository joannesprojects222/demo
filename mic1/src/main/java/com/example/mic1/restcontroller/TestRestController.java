package com.example.mic1.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic1")
public class TestRestController {
    @RequestMapping("mic1test")
    public String mic1Test()
    {
        return "mic1test";
    }
}
