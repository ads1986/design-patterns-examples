package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component {

    private List<Component> children;

    public Container() {
        this.children = new ArrayList<>();
    }

    public void add(Component component){
        children.add(component);
    }

    public void remove(Component component){
        children.remove(component);
    }

    @Override
    public String getName() {
        return "container";
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(Component c : children)
            total += c.getPrice();
        return total;
    }

}
