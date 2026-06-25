package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class UserControllerTest {

    @Test
    void testGetUser() throws Exception {

        UserController controller = new UserController();

        UserService service = new UserService();

        java.lang.reflect.Field field =
                UserController.class.getDeclaredField("userService");

        field.setAccessible(true);
        field.set(controller, service);

        MockMvc mockMvc =
                MockMvcBuilders.standaloneSetup(controller)
                        .build();

        mockMvc.perform(get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Nohitha"));
    }
}