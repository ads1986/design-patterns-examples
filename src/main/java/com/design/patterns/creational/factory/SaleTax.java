package com.design.patterns.creational.factory;

public class SaleTax implements Fee {
    @Override
    public double calculate(double amount) {
        int taxPercent = 3;
        return amount - ((amount * taxPercent)/100);
    }
}
