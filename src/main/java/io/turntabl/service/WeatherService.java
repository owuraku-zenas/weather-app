package io.turntabl.service;

import io.turntabl.WeatherInfo;
import io.turntabl.exception.WeatherServiceException;
import io.turntabl.weatherapi.WeatherApi;

public class WeatherService {
    private WeatherApi weatherApi;

    public WeatherService(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    public WeatherInfo getWeather(String location) throws WeatherServiceException {

        WeatherInfo weatherInfo = weatherApi.getWeatherData(location);

        if (weatherInfo == null) throw new WeatherServiceException("Could not retrieve weather data for location: " + location);


        return weatherInfo;
    }
}
