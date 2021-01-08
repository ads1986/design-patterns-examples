package com.design.patterns.creational.factory;

public class FactoryPropertyTax implements FactoryTax {
    @Override
    public Fee createTax() {
        return new PropertyTax();
    }
}
