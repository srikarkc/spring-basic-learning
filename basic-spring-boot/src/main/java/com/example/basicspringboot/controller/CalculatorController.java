package com.example.basicspringboot.controller;

import com.example.basicspringboot.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Result: " + calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return "Result: " + calculatorService.subtract(a, b);
    }
}
