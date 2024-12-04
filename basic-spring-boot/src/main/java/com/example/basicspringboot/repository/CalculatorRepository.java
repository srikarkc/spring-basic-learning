package com.example.basicspringboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepository {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
