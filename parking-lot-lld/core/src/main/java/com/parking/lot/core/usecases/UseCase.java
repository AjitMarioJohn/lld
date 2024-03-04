package com.parking.lot.core.usecases;

import com.parking.lot.core.domains.exceptions.ServiceException;

public abstract class UseCase< I extends  UseCase.Input, O extends UseCase.Output>{

    public abstract O execute(I input);

    public interface Input {}
    public interface Output {}

}
