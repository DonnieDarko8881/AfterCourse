package observer.observerWheather.WheatherForecast;

import lombok.Getter;
import lombok.Setter;
import observer.observerWheather.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class WeatherForecast implements Observable {
    private double temperature;
    private double pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(observer -> observer.updateForecast(this));
    }

    public void updateForecast(double temperature, double pressure){
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}
