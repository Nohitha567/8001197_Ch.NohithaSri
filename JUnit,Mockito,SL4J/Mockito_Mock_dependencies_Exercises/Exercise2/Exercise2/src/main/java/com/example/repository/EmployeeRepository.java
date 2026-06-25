package com.example.repository;

import com.example.entity.Employee;

public interface EmployeeRepository {

    Employee findById(Long id);
}