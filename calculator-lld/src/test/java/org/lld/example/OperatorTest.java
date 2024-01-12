package org.lld.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    public void test_Of_For_Addition() {
        assertEquals(Operator.ADDITION, Operator.of("+"));
    }

    @Test
    public void test_Of_For_Multiplication() {
        assertEquals(Operator.MULTIPLICATION, Operator.of("*"));
    }

    @Test
    public void test_Of_For_Division() {
        assertEquals(Operator.DIVISION, Operator.of("/"));
    }

    @Test
    public void test_Of_For_Subtraction() {
        assertEquals(Operator.SUBTRACTION, Operator.of("-"));
    }

    @Test
    public void test_Of_ForUnknown() {
        assertNull(Operator.of(""));
    }

}