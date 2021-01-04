package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class PointOfSale {

    public Component getTotalPrice(){

        Container container = new Container();
        container.add(new Product(2.0, "Pencil"));
        container.add(new Product(1.0, "Eraser"));

        Container group = new Container();
        group.add(container);
        group.add(new Product(7.0, "Eraser"));

        return group;
    }
}
