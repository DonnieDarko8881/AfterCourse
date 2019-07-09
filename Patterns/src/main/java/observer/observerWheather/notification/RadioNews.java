package observer.observerWheather.notification;

import observer.observerWheather.WheatherForecast.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + "" +
                ", ciśnienie:" + weatherForecast.getPressure() + "hPa");
    }
}
