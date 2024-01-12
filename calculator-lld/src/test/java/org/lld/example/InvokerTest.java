package org.lld.example;

import org.junit.jupiter.api.Test;
import org.lld.example.exceptions.ServiceException;

import static org.junit.jupiter.api.Assertions.*;

class InvokerTest {

    @Test
    public void testInvokeCommand_addition() throws ServiceException {
        double result = Invoker.invokeCommand(10, 20, Operator.ADDITION);
        assertEquals(30, result);
    }

    @Test
    public void testInvokeCommand_subtraction() throws ServiceException {
        double result = Invoker.invokeCommand(30, 20, Operator.SUBTRACTION);
        assertEquals(10, result);
    }

    @Test
    public void testInvokeCommand_multiplication() throws ServiceException {
        double result = Invoker.invokeCommand(10, 20, Operator.MULTIPLICATION);
        assertEquals(200, result);
    }

    @Test
    public void testInvokeCommand_division() throws ServiceException {
        double result = Invoker.invokeCommand(30, 20, Operator.DIVISION);
        assertEquals(1.5, result);
    }

    @Test
    public void testInvokeCommand_throwsException_unknownOperator() {
        ServiceException exception = assertThrows(ServiceException.class, () -> Invoker.invokeCommand(10, 20, null));
    }

}