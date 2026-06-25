package com.example.service;

import com.example.client.WeatherApiClient;
import com.example.entity.WeatherResponse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherServiceTest {

    @Mock
    private WeatherApiClient apiClient;

    @InjectMocks
    private WeatherService weatherService;

    @Test
    void testFetchWeather() {

        WeatherResponse response =
                new WeatherResponse("Hyderabad", "Sunny");

        when(apiClient.getWeather("Hyderabad"))
                .thenReturn(response);

        WeatherResponse result =
                weatherService.fetchWeather("Hyderabad");

        assertNotNull(result);
        assertEquals("Hyderabad", result.getCity());
        assertEquals("Sunny", result.getWeather());

        verify(apiClient).getWeather("Hyderabad");
    }
}