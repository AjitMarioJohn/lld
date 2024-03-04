package com.parking.lot.core.usecases.floors;

import com.parking.lot.core.domains.exceptions.ServiceException;

public class FloorException extends ServiceException {

    private String exceptionId = "Floor-Exception";

    public FloorException(String message) {
        super(message);
    }
}
