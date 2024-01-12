package org.lld.example.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionCommandTest {

    private Command command;

    @BeforeEach
    void setUp() {
        command = new DivisionCommand();
    }

    @Test
    public void testExecute() {
        assertEquals(2, command.execute(20,10));
    }
}