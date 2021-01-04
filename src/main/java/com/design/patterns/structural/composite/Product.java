package com.design.patterns.structural.composite;

public class Product implements Component {

    private double price;
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}
