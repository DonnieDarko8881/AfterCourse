package observer.observerWheather.notification;

import observer.observerWheather.WheatherForecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
