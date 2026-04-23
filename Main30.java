// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract String fuelType();
    abstract int noOfWheels();
}

// Car class
class Car extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

// Bike class
class Bike extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

// Main class
public class Main30 {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
	System.out.println("240390107046");
        System.out.println("Car Fuel Type: " + car.fuelType());
        System.out.println("Car Wheels: " + car.noOfWheels());

        System.out.println();

        System.out.println("Bike Fuel Type: " + bike.fuelType());
        System.out.println("Bike Wheels: " + bike.noOfWheels());
    }
}