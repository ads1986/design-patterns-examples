package com.design.patterns.creational.abstractFactory.model;

import com.design.patterns.creational.abstractFactory.ProportionalTaxes;

public class BusinessSaleTax implements ProportionalTaxes {
    @Override
    public double calculate(double amount) {
        int taxPercent = 5;
        return amount - ((amount * taxPercent)/100);
    }
}
