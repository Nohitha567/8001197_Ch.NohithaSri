package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository repository;

    @InjectMocks
    private EmployeeService service;

    @Test
    void testGetEmployee() {

        Employee employee =
                new Employee(101L, "Nohitha");

        when(repository.findById(101L))
                .thenReturn(employee);

        Employee result =
                service.getEmployee(101L);

        assertEquals(101L, result.getId());
        assertEquals("Nohitha", result.getName());
    }
}