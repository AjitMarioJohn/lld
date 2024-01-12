package org.lld.example.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionCommandTest {

    private Command command;

    @BeforeEach
    void initialize() {
        command = new SubtractionCommand();
    }

    @Test
    public void testExecute() {
        assertEquals(-10, command.execute(10,20));
    }

}