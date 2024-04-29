package com.parking.lot.core.exceptions;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    public DomainException(String messageFormat, Object... args) {
        super(String.format(messageFormat, args));
    }
}
