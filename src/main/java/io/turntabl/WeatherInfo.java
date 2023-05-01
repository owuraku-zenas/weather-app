package io.turntabl;

public class WeatherInfo {
    private String location;
    private double temperature;
    private String description;

    public WeatherInfo(String location, double temperature, String description) {
        this.location = location;
        this.temperature = temperature;
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }
}
