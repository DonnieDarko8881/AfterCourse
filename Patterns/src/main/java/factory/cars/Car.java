package factory.cars;

public abstract class Car {
    private final int productionYear;
    private final int engineCapicity;
    private final String fuel;
    private final WheelPosition wheelPosition;

    public Car(int productionYear, int engineCapacity, String fuel, WheelPosition wheelPosition) {
        this.productionYear = productionYear;
        this.engineCapicity = engineCapacity;
        this.fuel = fuel;
        this.wheelPosition = wheelPosition;
    }

    public WheelPosition getWheelPosition() {
        return wheelPosition;
    }
}
