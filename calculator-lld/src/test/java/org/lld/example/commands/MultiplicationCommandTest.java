package org.lld.example.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationCommandTest {

    private Command command;

    @BeforeEach
    void setUp() {
        command = new MultiplicationCommand();
    }

    @Test
    public void testExecute() {
        assertEquals(200, command.execute(10,20));
    }
}