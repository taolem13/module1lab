package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vehicle {
    static int numberOfWheels;
    static String color;
    static float engineSize;
    static String fuelType;

    //Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    //Getter and Setter methods
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "red", 2.0f, "petrol");

        Car c1 = new Car("Toyota", 4, "red", 2.0f, "petrol");

        c1.displayInfo();
        c1.honk();

        c1.setBrand("Kia");
        c1.setNumberOfWheels(6);
        c1.setColor("blue");
        c1.setEngineSize(2.5f);
        c1.setFuelType("gasoline");

        c1.displayInfo();
        c1.honk();
        }
    }
