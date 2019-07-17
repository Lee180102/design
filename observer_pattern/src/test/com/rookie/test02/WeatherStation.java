package test.com.rookie.test02;

import main.demo02.com.rookie.observable.WeatherData;
import main.demo02.com.rookie.observer.CurrentConditionsDisplay;
import main.demo02.com.rookie.observer.ForecastDisplay;
import main.demo02.com.rookie.observer.StatisticsDisplay;

import java.util.Observable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
