package com.design.patterns;

import com.design.patterns.structural.facade.CalculusFacadeImpl;
import com.design.patterns.structural.facade.CalculusService;

/**
    Design Patterns Examples

 */
public class Main {

    public static void main(String args[]){
        // Estructural -> Facade
        CalculusService service = new CalculusService(new CalculusFacadeImpl());
        System.out.println("Triangle Area : " + service.calculateTriangleArea("3", "10"));
    }

}