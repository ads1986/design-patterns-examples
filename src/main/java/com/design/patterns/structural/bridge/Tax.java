package com.design.patterns.structural.bridge;

public interface Tax {
    String getName();
    double getPercentage(double grossValue);
}
