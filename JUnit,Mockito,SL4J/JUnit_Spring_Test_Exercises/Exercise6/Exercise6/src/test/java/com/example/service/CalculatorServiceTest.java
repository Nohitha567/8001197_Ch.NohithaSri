package com.example.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService service =
            new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "10,20,30",
            "5,15,20",
            "-5,5,0",
            "100,200,300"
    })
    void testAddition(int a, int b, int expected) {

        assertEquals(
                expected,
                service.add(a, b)
        );
    }
}