package com.design.patterns.structural.bridge;

public class SmallSizeCompany extends Company {

    public SmallSizeCompany(String companyName, Tax tax) {
        super(companyName, tax);
    }

    @Override
    public double getLiquidAssets(double grossValue) {
        return (grossValue / 100) * (100 - this.tax.getPercentage(grossValue));
    }
}
