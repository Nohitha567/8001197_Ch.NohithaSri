package com.example.entity;

public class WeatherResponse {

    private String city;
    private String weather;

    public WeatherResponse() {
    }

    public WeatherResponse(String city, String weather) {
        this.city = city;
        this.weather = weather;
    }

    public String getCity() {
        return city;
    }

    public String getWeather() {
        return weather;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}