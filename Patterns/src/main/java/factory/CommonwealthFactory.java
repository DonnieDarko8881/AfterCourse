package factory;

import factory.cars.*;

public class CommonwealthFactory implements Factory{
    public final static WheelPosition position = WheelPosition.RIGHT;

    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford(2002, 150, "Diesel", position);
            case FOCUS:
                return new Ford(2001, 1000, "Gas", position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case E60:
                return new Ford(2002, 200150, "Diesel", position);
            case X5:
                return new Ford(2007, 100, "Gas", position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}
