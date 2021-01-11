package com.design.patterns.creational.abstractFactory;

public interface FactoryTaxes {
    RegressiveTaxes createRegressiveTax();
    ProportionalTaxes createProportionalTax();
}
