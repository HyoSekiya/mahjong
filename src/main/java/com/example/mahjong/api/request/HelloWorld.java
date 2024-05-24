package com.example.mahjong.api.request;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public Map<String,String> hello(){
        Map<String,String> hello = new HashMap<>();

        hello.put("ひょう","Hello");

        return hello;
    }
}
