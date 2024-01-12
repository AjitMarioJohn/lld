package org.lld.example.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionCommandTest {

    private Command command;

    @BeforeEach
    void initialize() {
        command = new AdditionCommand();
    }

    @Test
    public void testExecute() {
        assertEquals(30, command.execute(10,20));
    }

}