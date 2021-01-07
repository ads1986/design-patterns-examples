package com.design.patterns.structural.flightweight;

import java.util.HashMap;
import java.util.Map;

public class AddressFactory {

    public static Map<String, Address> addressMap = new HashMap<>();

    public static Address getAddress(String type){

        if (addressMap.containsKey(type)) {
            System.out.println("Founded address type " + type + " in cache");
            return addressMap.get(type);
        }

        Address address = null;

        switch (type){
            case "mainStorage":
                System.out.println("Address mainStorage created");
                address = new Address(type, "5th Avenue", "2000");
                break;
            case "store2":
                System.out.println("Address store2 created");
                address = new Address(type, "Long island south Avenue", "100");
                break;
            default :
                System.out.println("Address type not found");
        }

        if (address != null) addressMap.put(type, address);

        return address;
    }
}
