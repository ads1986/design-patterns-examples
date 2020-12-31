package com.design.patterns.structural.bridge;

public abstract class Company {

    Tax tax;
    String name;

    public Company(String companyName, Tax tax) {
        this.name = companyName;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public abstract double getLiquidAssets(double grossValue);
}
