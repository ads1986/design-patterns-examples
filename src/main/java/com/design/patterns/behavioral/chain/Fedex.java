package com.design.patterns.behavioral.chain;

public class Fedex extends DeliveryChain {
    public Fedex(DeliveryEnum id) {
        super(DeliveryEnum.FEDEX);
    }

    @Override
    protected void post() {
        System.out.println("Posted by Fedex.");
    }
}
