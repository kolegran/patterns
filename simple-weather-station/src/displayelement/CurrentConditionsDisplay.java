package displayelement;

import observer.Observer;
import subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // To cancel the registration of observers
    private final Subject weatherData;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("Current conditions: temperature is " + temperature
                + " , humidity is " + humidity
                + ", pressure is " + pressure
        );
    }
}
