package observer.observerWheather.notification;

import observer.observerWheather.WheatherForecast.WeatherForecast;

public class TvNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Tv - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + "" +
                ", ciśnienie:" + weatherForecast.getPressure() + "hPa");
    }
}
