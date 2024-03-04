package com.parking.lot.core.domains.commons;

import lombok.Value;

@Value
public class Identity {
    private final Long number;
    public static Identity nothing() {
        return new Identity(Long.MIN_VALUE);
    }
}
