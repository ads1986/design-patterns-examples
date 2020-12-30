package com.design.patterns.structural.decorator;

public class PlatinumCheckingAccount extends DecoratorAccount {

    private Account account;

    public PlatinumCheckingAccount(Account account) {
        this.account = account;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    public double getOverdraft() {
        return 10000.0;
    }

}
