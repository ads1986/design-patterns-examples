package com.design.patterns.structural.flightweight;

import java.util.List;

public class Order {
    public int number;
    public List<Product> products;

    public Order(int number, List<Product> products) {
        this.number = number;
        this.products = products;
    }
}
