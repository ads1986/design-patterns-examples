package com.design.patterns.creational.abstractFactory.factory;

import com.design.patterns.creational.abstractFactory.FactoryTaxes;
import com.design.patterns.creational.abstractFactory.ProportionalTaxes;
import com.design.patterns.creational.abstractFactory.RegressiveTaxes;
import com.design.patterns.creational.abstractFactory.model.IndividualPropertyTax;
import com.design.patterns.creational.abstractFactory.model.IndividualSaleTax;

public class FactoryIndividualTax implements FactoryTaxes {


    @Override
    public RegressiveTaxes createRegressiveTax() {
        return new IndividualPropertyTax();
    }

    @Override
    public ProportionalTaxes createProportionalTax() {
        return new IndividualSaleTax();
    }

}
