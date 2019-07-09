package observer.observerWheather.WheatherForecast;

import observer.observerWheather.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
