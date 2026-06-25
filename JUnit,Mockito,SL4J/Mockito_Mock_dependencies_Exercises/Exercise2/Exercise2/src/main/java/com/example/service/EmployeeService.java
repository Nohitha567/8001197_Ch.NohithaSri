package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee getEmployee(Long id) {

        return repository.findById(id);
    }
}