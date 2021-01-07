package com.design.patterns.structural.flightweight;

public class Address {
    public String type;
    public String address;
    public String number;

    public Address(String type, String address, String number) {
        this.type = type;
        this.address = address;
        this.number = number;
    }
}
