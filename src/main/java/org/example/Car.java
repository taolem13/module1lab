package org.example;

public class Car extends Vehicle {
    static String brand;

    //Constructor
    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    //Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
    }
}