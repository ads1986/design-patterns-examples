package com.design.patterns.structural.flightweight;

import java.util.List;
import java.util.Random;

public class PlaceOrder {

    public void placeOrder(List<Product> products, String sourceAddressType, Address destination){
        Random random = new Random();
        Order order = new Order(Math.abs(random.nextInt()), products);
        System.out.println("Create Order number :" + order.number);
        Address source  = AddressFactory.getAddress(sourceAddressType);
        SendOrder.send(order, source, destination);
    }

}
