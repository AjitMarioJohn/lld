package org.lld.example.commands;

public class DivisionCommand implements Command {
    @Override
    public double execute(double num1, double num2) {
        return num1/num2;
    }
}
