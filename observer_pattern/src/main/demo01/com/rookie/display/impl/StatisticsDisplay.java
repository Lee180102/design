package main.demo01.com.rookie.display.impl;

import main.demo01.com.rookie.display.DisplayElement;
import main.demo01.com.rookie.observer.Observer;
import main.demo01.com.rookie.subject.Subject;
import main.demo01.com.rookie.subject.impl.WeatherData;

/**
 * 此布告板跟踪最小,平均,最大的观测值,并显示他们
 */
public class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    display();
}
}
