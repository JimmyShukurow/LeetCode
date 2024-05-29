package io.smartir.DesignPatterns.ObserverPattern.weatherDataExample;

import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.display.CurrentConditionsDisplay;
import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.display.HeatIndexDisplay;
import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,72,29.2f);
        weatherData.setMeasurements(78,90,28.7f);
    }
}
