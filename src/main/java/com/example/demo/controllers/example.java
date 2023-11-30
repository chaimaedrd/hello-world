package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class example {
    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("message", "Hello world From Morocco");
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "hello";
    }
}
