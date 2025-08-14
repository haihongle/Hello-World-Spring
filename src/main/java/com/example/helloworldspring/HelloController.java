package com.example.helloworldspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World Spring";
    }
}
