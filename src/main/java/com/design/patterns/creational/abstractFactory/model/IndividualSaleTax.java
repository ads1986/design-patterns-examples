package com.design.patterns.creational.abstractFactory.model;

import com.design.patterns.creational.abstractFactory.ProportionalTaxes;

public class IndividualSaleTax implements ProportionalTaxes {
    @Override
    public double calculate(double amount) {
        int taxPercent = 1;
        return amount - ((amount * taxPercent)/100);
    }
}
