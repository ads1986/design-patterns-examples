package com.design.patterns.behavioral.command;

public class OpenGate implements Command {

    private Gate gate;

    public OpenGate(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void execute() {
        this.gate.open();
    }

    @Override
    public void undo() {
        this.gate.close();
    }

}