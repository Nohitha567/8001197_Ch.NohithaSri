package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {

        UserRepository mockRepository =
                mock(UserRepository.class);

        User mockUser =
                new User(1L, "Nohitha");

        when(mockRepository.findById(1L))
                .thenReturn(Optional.of(mockUser));

        UserService userService =
                new UserService(mockRepository);

        User result =
                userService.getUserById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("Nohitha", result.getName());

        verify(mockRepository)
                .findById(1L);
    }
}