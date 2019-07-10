package factory;

import factory.cars.BMWModel;
import factory.cars.Car;
import factory.cars.FordModel;

public interface Factory {
    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);
}
