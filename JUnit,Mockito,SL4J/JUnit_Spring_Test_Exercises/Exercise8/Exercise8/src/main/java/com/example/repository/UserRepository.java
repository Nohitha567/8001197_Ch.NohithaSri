package com.example.repository;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    User findById(Long id);
}