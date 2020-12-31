package com.design.patterns.structural.bridge;

public class MicroSizeCompany extends Company {

    public MicroSizeCompany(String companyName, Tax tax) {
        super(companyName, tax);
    }

    @Override
    public double getLiquidAssets(double grossValue) {
        if (grossValue < 50)
            return grossValue;
        return (grossValue / 100) * (100 - this.tax.getPercentage(grossValue));
    }
}
