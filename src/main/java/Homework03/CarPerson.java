package Homework03;

public class CarPerson {

    public static void main(String[] args) {
        {
            Car car1 = new Car();
            car1.year = 2022;
            car1.price = 25000.00;
            car1.fuelTankCapacity = 60.0;
            car1.freeFuel = 50.0;
            car1.engineFuelOperationSystem = "Petrol";

            Car car2 = new Car();
            car2.year = 2023;
            car2.price = 32_000.00;
            car2.fuelTankCapacity = 70.0;
            car2.freeFuel = 70.0;
            car2.engineFuelOperationSystem = "Diesel";

            car1.usefuel(35.0);
            car2.changeЕngineFuelOperationSystem("Electric");
            System.out.println("State of car 1:");
            System.out.println("Year: {car1.Year}");
            System.out.println("Price: {car1.Price:C}");
            System.out.println("Tank capacity: {car1.FuelTankCapacity} liters");
            System.out.println("Free fuel: {car1.FreeFuel} liters");
            System.out.println("Fuel system: {car1.EngineFuelOperationSystem}");
            System.out.println();
            System.out.println("State of car 2:");
            System.out.println("Year: {car2.Year}");
            System.out.println("Price: {car2.Price:C}");
            System.out.println("Tank capacity: {car1.FuelTankCapacity} liters");
            System.out.println("Free fuel: {car2.FreeFuel} liters");
            System.out.println("Fuel system: {car2.EngineFuelOperationSystem}");
        }
    }
}

