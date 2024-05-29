package io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.display;

import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.Observer;
import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.Subject;

public class HeatIndexDisplay implements Observer, DisplayElements {
    private double heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        double c1 = -42.379, c2 = 2.04901523, c3 = 10.14333127, c4 = -0.22475541, c5 = -6.83783e-3, c6 = -5.481717e-2, c7 = 1.22874e-3, c8 = 8.5282e-4, c9 = -1.99e-6;
        heatIndex = c1
                + (c2 * temp)
                + (c3 * humidity)
                + (c4 * temp * humidity)
                + (c5 * Math.pow(temp, 2))
                + (c6 * Math.pow(humidity, 2))
                + (c7 * Math.pow(temp, 2) * humidity)
                + (c8 * temp * Math.pow(humidity, 2))
                + (c9 * Math.pow(temp, 2) * Math.pow(humidity, 2));
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is: " + heatIndex + " 😁 ");
    }
}
