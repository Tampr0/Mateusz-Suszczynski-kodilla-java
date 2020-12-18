package com.kodilla;

public class HowSuperWorks {
    public static void main(String[] args) {
        Car car = new Car(2.0, "Ford", "2010");
        System.out.println(car.getModel());

    }
}
class Vehicle
{
    private String model;
    private String year;

    public Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}

class Car extends Vehicle
{
    private double engineCapacity;

    public Car(double engineCapacity, String model, String year) {
        super(model, year);
        this.engineCapacity = engineCapacity;
    }
    public void turnOnEngine() {
    }

    public void turnOffEngine() {
    }
}
