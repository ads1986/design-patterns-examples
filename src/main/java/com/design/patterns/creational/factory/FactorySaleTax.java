package com.design.patterns.creational.factory;

public class FactorySaleTax implements FactoryTax {
    @Override
    public Fee createTax() {
        return new SaleTax();
    }
}
