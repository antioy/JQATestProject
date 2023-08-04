package Homework03;

public class Car {
    public int year;
    public double price;
    boolean isSportCar;
    public double fuelTankCapacity;
    public double freeFuel;
    public String engineFuelOperationSystem;

    void changeЕngineFuelOperationSystem (String newЕngineFuelOperationSystem) {
        engineFuelOperationSystem = newЕngineFuelOperationSystem;
        System.out.println ("The new engine fuel operation system is: " +
                newЕngineFuelOperationSystem);
    }
    void useFuel(double fuel ) {
        fuel = freeFuel - fuel;
        System.out.println("Use Fuel is " + fuel);
        if (fuel > 50) {
            System.out.println("Not enough free fuel!");
        }

    }

    public void usefuel(double v) {
    }
}
