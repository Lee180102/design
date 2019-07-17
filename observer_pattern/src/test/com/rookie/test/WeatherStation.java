package test.com.rookie.test;

import main.demo01.com.rookie.display.impl.CurrentConditionsDisplay;
import main.demo01.com.rookie.display.impl.ForecastDisplay;
import main.demo01.com.rookie.display.impl.HeatIndexDisplay;
import main.demo01.com.rookie.display.impl.StatisticsDisplay;
import main.demo01.com.rookie.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(11,11,11.1f);
        weatherData.setMeasurements(22,22,22.2f);
        weatherData.setMeasurements(33,33,33.3f);
    }
}
