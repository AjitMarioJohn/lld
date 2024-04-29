package com.parking.lot.core.exceptions;

public class NotFoundException extends DomainException{
    public NotFoundException(String messageFormat, Object... args) {
        super(messageFormat, args);
    }

    public NotFoundException(String message) {
        super(message);
    }
}
