package com.design.patterns.behavioral.command;

public class Application {

    private Command openGate;
    private Command closeGate;

    public Application(Command openGate, Command closeGate) {
        this.openGate = openGate;
        this.closeGate = closeGate;
    }

    public void openGate(){
        this.openGate.execute();

        System.out.println("Gate opened.");
    }

    public void closeGate(){
        this.closeGate.execute();

        System.out.println("Gate closed.");
    }
}