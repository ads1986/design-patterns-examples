package com.design.patterns.creational.abstractFactory.factory;

import com.design.patterns.creational.abstractFactory.FactoryTaxes;
import com.design.patterns.creational.abstractFactory.ProportionalTaxes;
import com.design.patterns.creational.abstractFactory.RegressiveTaxes;
import com.design.patterns.creational.abstractFactory.model.BusinessPropertyTax;
import com.design.patterns.creational.abstractFactory.model.BusinessSaleTax;

public class FactoryBusinessTax implements FactoryTaxes {


    @Override
    public RegressiveTaxes createRegressiveTax() {
        return new BusinessPropertyTax();
    }

    @Override
    public ProportionalTaxes createProportionalTax() {
        return new BusinessSaleTax();
    }

}
