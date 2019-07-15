package main.com.rookie.display.impl;

import main.com.rookie.display.DisplayElement;
import main.com.rookie.observer.Observer;
import main.com.rookie.subject.Subject;
import main.com.rookie.subject.impl.WeatherData;

/**
 * 此布告板根据气压计显示天气预报
 */
public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
