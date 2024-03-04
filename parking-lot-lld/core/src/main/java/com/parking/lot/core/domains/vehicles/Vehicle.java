package com.parking.lot.core.domains.vehicles;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Vehicle {

    protected final String licenseNumber;
    protected abstract String assignSlot();
}
