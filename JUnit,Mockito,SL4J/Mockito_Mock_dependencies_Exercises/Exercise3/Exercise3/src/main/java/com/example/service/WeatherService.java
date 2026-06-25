package com.example.service;

import com.example.client.WeatherApiClient;
import com.example.entity.WeatherResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherApiClient apiClient;

    public WeatherResponse fetchWeather(String city) {
        return apiClient.getWeather(city);
    }
}