package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void testGetUser() {

        User user =
                new User(1L, "Nohitha");

        when(repository.findById(1L))
                .thenReturn(user);

        User result =
                service.getUser(1L);

        assertEquals(1L, result.getId());
        assertEquals("Nohitha", result.getName());
    }
}