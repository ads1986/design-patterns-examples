package com.design.patterns.structural.bridge;

public class SmallCorporationTax implements Tax {

    @Override
    public String getName() {
        return "Small S-corporations Tax";
    }

    @Override
    public double getPercentage(double grossValue) {
        return grossValue <= 900 ? 10.0 : 26.9;
    }

}
