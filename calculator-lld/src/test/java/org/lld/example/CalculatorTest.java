package org.lld.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void initialize() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(30, calculator.set(10).set(20).set("+").execute());
    }

    @Test
    public void testSubtraction() {
        assertEquals(-10, calculator.set(10).set(20).set("-").execute());
    }

    @Test
    public void testMultiplication() {
        assertEquals(200, calculator.set(10).set(20).set("*").execute());
    }

    @Test
    public void testDivision() {
        assertEquals(0.5, calculator.set(10).set(20).set("/").execute());
    }

    @Test
    public void testReset() {
        calculator.set(10).set(20).set("/").execute();
        assertEquals(0, calculator.reset().execute());
    }

}