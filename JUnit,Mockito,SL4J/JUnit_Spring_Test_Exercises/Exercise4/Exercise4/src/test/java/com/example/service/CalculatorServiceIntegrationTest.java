package com.example.service;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorServiceIntegrationTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void testAdd() {

        int result =
                calculatorService.add(10, 20);

        assertEquals(30, result);
    }
}