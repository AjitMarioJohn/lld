package com.parking.lot.core.domains.payments;

import com.parking.lot.core.domains.commons.PaymentStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Payments {

    private double amount;
    private PaymentStatus status;
    private LocalDateTime timestamp;

    public abstract boolean initiateTransaction();

}
