package org.lld.example;

import org.lld.example.commands.Command;
import org.lld.example.exceptions.ServiceException;

public class Invoker {
    public static double invokeCommand(double num1, double num2, Operator operator) throws ServiceException {
        Command command = CommandFactory.getCommands(operator);
        return command.execute(num1, num2);
    }
}
