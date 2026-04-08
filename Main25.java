class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
	System.out.println("240390107046");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable,
                double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class Main25 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH01AB1234", "Tata", "Petrol");
        Car c1 = new Car("MH02CD5678", "Hyundai", "Diesel", 5, true);
        ElectricCar e1 = new ElectricCar("MH03EF9012", "Tesla", "Electric", 5, true, 75.0, 1.5);

        v1.displayDetails();
        System.out.println();

        c1.displayDetails();
        System.out.println();

        e1.displayDetails();
        System.out.println();

        Vehicle v = new Car("MH04GH3456", "Honda", "Petrol", 4, true);
        v.displayDetails();

        if (v instanceof Car) {
            Car c = (Car) v;
            System.out.println("Downcasting successful. Seats: " + c.numberOfSeats);
        }
    }
}