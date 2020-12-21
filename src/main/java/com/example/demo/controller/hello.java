package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class hello {
    @GetMapping("/")
    public String helloGet() {
        return "Hello From Get";
    }

    @PostMapping("/")
    public String helloPost() {
        return "Hello From Post";
    }

    @PutMapping("/")
    public String helloPut() {
        return "Hello From Put";
    }

    @DeleteMapping("/")
    public String helloDelete() {
        return "Hello From Delete";
    }
}
