package com.design.patterns.structural.decorator;

public abstract class Account {

    private double balance;

    public abstract double getOverdraft();

    public void addMoney(double money){
        System.out.println("Adding -> R$ " + money);
        this.balance += money;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getTotalBalance(){
        return getBalance() + getOverdraft();
    }

}
