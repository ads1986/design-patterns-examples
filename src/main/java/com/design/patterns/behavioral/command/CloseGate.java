package com.design.patterns.behavioral.command;

public class CloseGate implements Command {

    private Gate gate;

    public CloseGate(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void execute() {
        this.gate.close();
    }

    @Override
    public void undo() {
        this.gate.open();
    }

}