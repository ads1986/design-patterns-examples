package com.design.patterns.creational.factory;

public class PropertyTax implements Fee {
    @Override
    public double calculate(double amount) {
        int taxPercent = 10;
        return amount - ((amount * taxPercent)/100);
    }
}
