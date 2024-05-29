package io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.display;

import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.Observer;
import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
