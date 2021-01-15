package com.design.patterns.creational.prototype;

public class Motorcycle implements VehiclePrototype {
    private String name;
    private String brand;
    private double price;

    public Motorcycle(Motorcycle car) {
        this.name = car.getName();
        this.brand = car.getBrand();
        this.price = car.getPrice();
    }

    public Motorcycle(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Motorcycle clone() {
        return new Motorcycle(this);
    }
}
