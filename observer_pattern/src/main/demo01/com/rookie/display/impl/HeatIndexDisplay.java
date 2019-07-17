package main.demo01.com.rookie.display.impl;

import main.demo01.com.rookie.display.DisplayElement;
import main.demo01.com.rookie.observer.Observer;
import main.demo01.com.rookie.subject.Subject;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 */
public class HeatIndexDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float v = computeHeatIndex(temperature, humidity);
        System.out.println("HeatIndex: " + v );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

}
