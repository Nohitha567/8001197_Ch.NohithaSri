package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testVoidMethodException() {

        NotificationService mockService =
                mock(NotificationService.class);

        doThrow(
                new RuntimeException(
                        "Notification Failed"
                )
        ).when(mockService)
         .sendNotification(anyString());

        UserService service =
                new UserService(mockService);

        assertThrows(
                RuntimeException.class,
                () -> service.registerUser("John")
        );

        verify(mockService)
                .sendNotification(
                        "User John registered successfully"
                );
    }
}