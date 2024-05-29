package io.smartir.DesignPatterns.ObserverPattern.weatherDataExample;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
