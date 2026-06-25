package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a,
                   @RequestParam int b) {

        return a + b;
    }
}