package main.demo01.com.rookie.subject.impl;

import main.demo01.com.rookie.observer.Observer;
import main.demo01.com.rookie.subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 初始化observers
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * @param o 观察者变量
     * 当注册观察者时
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当气象站得到更新值,通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * @param temperature
     * @param humidity
     * @param pressure
     *
     *
     */
    public void setMeasurements(float temperature ,float humidity, float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }
}
