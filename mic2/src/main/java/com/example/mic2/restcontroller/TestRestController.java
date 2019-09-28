package com.example.mic2.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic2")
public class TestRestController {
    @RequestMapping("mic2test")
    public String mict2Test()
    {
        return "mic2test";
    }
}
