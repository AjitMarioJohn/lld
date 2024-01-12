package org.lld.example;

import org.lld.example.commands.Command;
import org.lld.example.commands.AdditionCommand;
import org.lld.example.commands.DivisionCommand;
import org.lld.example.commands.MultiplicationCommand;
import org.lld.example.commands.SubtractionCommand;
import org.lld.example.exceptions.InvalidOperatorException;
import org.lld.example.exceptions.ServiceException;

import java.util.Objects;

public class CommandFactory {

    public static Command getCommands(Operator operator) throws ServiceException {

        if (Objects.isNull(operator)) {
            throw new InvalidOperatorException("Operator is undefined");
        }

        return switch (operator) {
            case ADDITION :
                yield new AdditionCommand();

            case DIVISION:
                yield new DivisionCommand();

            case SUBTRACTION:
                yield new SubtractionCommand();

            case MULTIPLICATION:
                yield new MultiplicationCommand();
        };
    }

}
