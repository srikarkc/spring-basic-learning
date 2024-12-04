package com.example.basicspringboot.service;

import com.example.basicspringboot.repository.CalculatorRepository;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final CalculatorRepository calculatorRepository;

    // Constructor-based Dependency Injection
    public CalculatorService(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    public int add(int a, int b) {
        return calculatorRepository.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculatorRepository.subtract(a, b);
    }
}
