package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    void testDivideByZero() {

        CalculatorService service =
                new CalculatorService();

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> service.divide(10, 0)
                );

        assertEquals(
                "Division by zero is not allowed",
                exception.getMessage()
        );
    }
}