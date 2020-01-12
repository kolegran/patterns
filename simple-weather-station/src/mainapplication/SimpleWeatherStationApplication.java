package mainapplication;

import displayelement.CurrentConditionsDisplay;
import weatherdata.WeatherData;

public class SimpleWeatherStationApplication {

    public static void main(String[] args) {
	    final WeatherData weatherData = new WeatherData();
	    final CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4d);
        currentConditionsDisplay.display();
        weatherData.setMeasurements(82, 70, 29.2d);
        currentConditionsDisplay.display();
        weatherData.setMeasurements(78, 90, 29.2d);
        currentConditionsDisplay.display();
    }
}
