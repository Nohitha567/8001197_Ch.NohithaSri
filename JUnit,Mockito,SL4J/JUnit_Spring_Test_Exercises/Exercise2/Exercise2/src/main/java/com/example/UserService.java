package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {

        return userRepository
                .findById(id)
                .orElse(null);
    }
}