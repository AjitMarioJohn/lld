package org.lld.example;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class Calculator {

    private double result;
    private double number;
    private Operator operator;

    public Calculator set(double number) {
        this.number = number;
        if (result == 0) {
            result = number;
        }
        return this;
    }

    public Calculator set(String operator) {
        this.operator = Operator.of(operator);
        return this;
    }

    public Calculator reset() {
        this.result = 0;
        this.number = 0;
        this.operator = null;
        return this;
    }

    public double execute() {
        try {
            result = Invoker.invokeCommand(result, number, operator);
        } catch (Exception exception) {
            log.log(Level.SEVERE, exception.getMessage());
        }
        return result;
    }

}
