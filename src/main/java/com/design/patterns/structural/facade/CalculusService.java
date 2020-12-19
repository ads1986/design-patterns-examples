package com.design.patterns.structural.facade;

public class CalculusService {

    private CalculusFacadeImpl calculator;

    public CalculusService(CalculusFacadeImpl calculator) {
        this.calculator = calculator;
    }

    public Double calculateTriangleArea(String b, String h){
        return calculator.calculateTriangleArea(b, h);
    }
    
}