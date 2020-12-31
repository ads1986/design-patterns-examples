package com.design.patterns.structural.bridge;

public class SmallPartnershipTax implements Tax {
    @Override
    public String getName() {
        return "Sole Proprietorship Tax";
    }

    @Override
    public double getPercentage(double grossValue) {
        return grossValue <= 100 ? 5.0 : 23.6;
    }
}
