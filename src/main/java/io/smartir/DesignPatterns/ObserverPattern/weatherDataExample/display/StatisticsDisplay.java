package io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.display;

import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.Observer;
import io.smartir.DesignPatterns.ObserverPattern.weatherDataExample.Subject;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElements {

    private float max;
    private ArrayList<Float> all = new ArrayList<>();
    private float min;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + getAvg() + "/" + max +"/" + min);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (min > 0) {
            min = Math.min(min, temp);
        } else {
            min = temp;
        }
        max = Math.max(max, temp);
        all.add(temp);
        display();
    }

    public float getAvg() {
        return (float) all.stream().mapToDouble(Float::doubleValue).average().orElse(0);
    }
}
