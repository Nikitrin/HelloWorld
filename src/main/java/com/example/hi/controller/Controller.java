package com.example.hi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {

    @GetMapping("/hi")
    public String hi() {
        return "Hello world";
    }

    @GetMapping("/hi-by-name")
    public String hiByName(@RequestParam String name) {
        return "Hi " + name + "!";
    }
}
