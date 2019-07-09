package observer.observerWheather.notification;

import observer.observerWheather.WheatherForecast.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + "" +
                ", ciśnienie:" + weatherForecast.getPressure() + "hPa");
    }
}
