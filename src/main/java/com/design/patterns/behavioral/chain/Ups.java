package com.design.patterns.behavioral.chain;

public class Ups extends DeliveryChain {
    public Ups(DeliveryEnum id) {
        super(DeliveryEnum.UPS);
    }

    @Override
    protected void post() {
        System.out.println("Posted by UPS.");
    }
}
