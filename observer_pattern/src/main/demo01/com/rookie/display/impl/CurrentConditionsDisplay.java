package main.demo01.com.rookie.display.impl;

import main.demo01.com.rookie.display.DisplayElement;
import main.demo01.com.rookie.observer.Observer;
import main.demo01.com.rookie.subject.Subject;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;
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
        this.pressure = pressure;
        display();
    }
}
