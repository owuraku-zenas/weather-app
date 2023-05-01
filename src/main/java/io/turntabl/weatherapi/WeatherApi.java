package io.turntabl.weatherapi;

import io.turntabl.WeatherInfo;

public interface WeatherApi {
    WeatherInfo getWeatherData(String location);
}
