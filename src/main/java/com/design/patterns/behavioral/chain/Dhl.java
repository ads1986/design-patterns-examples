package com.design.patterns.behavioral.chain;

public class Dhl extends DeliveryChain {
    public Dhl(DeliveryEnum id) {
        super(DeliveryEnum.DHL);
    }

    @Override
    protected void post() {
        System.out.println("Posted by DHL.");
    }
}
