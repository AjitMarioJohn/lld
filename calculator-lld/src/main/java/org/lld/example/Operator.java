package org.lld.example;

import java.util.Arrays;
import java.util.Objects;

public enum Operator {

    ADDITION("+"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    SUBTRACTION("-");

    private String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator of(String symbol) {
        return Arrays.stream(Operator.values()).filter(ops -> Objects.equals(ops.getSymbol(), symbol))
                .findFirst().orElse(null);
    }
}
