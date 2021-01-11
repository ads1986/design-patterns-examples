package com.design.patterns.creational.abstractFactory.model;

import com.design.patterns.creational.abstractFactory.ProportionalTaxes;
import com.design.patterns.creational.abstractFactory.RegressiveTaxes;

public class IndividualPropertyTax implements RegressiveTaxes {
    @Override
    public double calculate(double amount) {
        int taxPercent = 10;
        return amount - ((amount * taxPercent)/100);
    }
}
