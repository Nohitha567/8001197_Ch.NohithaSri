package com.example.client;

import com.example.entity.WeatherResponse;

public interface WeatherApiClient {

    WeatherResponse getWeather(String city);
}