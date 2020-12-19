package com.design.patterns.structural.facade;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;

import static java.lang.Double.valueOf;

public class CalculusFacadeImpl implements CalculusFacade {

    public Double calculateTriangleArea(String b, String h){
        Function At = new Function("At(b,h) = 1/2 * b * h");
        Argument argumentB = new Argument("b = 3");
        Argument argumentH = new Argument("h = 10");
        Expression exp = new Expression("At(b,h)", At, argumentB, argumentH);
        return valueOf(exp.calculate());
    }

}