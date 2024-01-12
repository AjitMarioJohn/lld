package org.lld.example;

import org.junit.jupiter.api.Test;
import org.lld.example.commands.*;
import org.lld.example.exceptions.InvalidOperatorException;
import org.lld.example.exceptions.ServiceException;

import static org.junit.jupiter.api.Assertions.*;

class CommandFactoryTest {

    @Test
    public void testAdditionCommand() throws ServiceException {
        Command command = CommandFactory.getCommands(Operator.ADDITION);
        assertInstanceOf(AdditionCommand.class, command);
    }

    @Test
    public void testDivisionCommand() throws ServiceException {
        Command command = CommandFactory.getCommands(Operator.DIVISION);
        assertInstanceOf(DivisionCommand.class, command);
    }

    @Test
    public void testSubtractionCommand() throws ServiceException {
        Command command = CommandFactory.getCommands(Operator.SUBTRACTION);
        assertInstanceOf(SubtractionCommand.class, command);
    }

    @Test
    public void testMultiplicationCommand() throws ServiceException {
        Command command = CommandFactory.getCommands(Operator.MULTIPLICATION);
        assertInstanceOf(MultiplicationCommand.class, command);
    }

    @Test
    public void testForNull() throws ServiceException {
        ServiceException exception = assertThrows(InvalidOperatorException.class, () -> CommandFactory.getCommands(null));
        assertEquals("Operator is undefined", exception.getMessage());
    }
}