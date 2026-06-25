package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testVoidMethod() {

        NotificationService mockService =
                mock(NotificationService.class);

        doNothing().when(mockService)
                   .sendNotification(anyString());

        UserService service =
                new UserService(mockService);

        service.registerUser("John");

        verify(mockService)
                .sendNotification(
                        "User John registered successfully"
                );
    }
}