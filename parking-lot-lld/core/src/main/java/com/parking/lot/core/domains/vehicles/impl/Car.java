package com.parking.lot.core.domains.vehicles.impl;

import com.parking.lot.core.domains.vehicles.Vehicle;

public class Car extends Vehicle {
    public Car(String licenseNumber) {
        super(licenseNumber);
    }

    @Override
    protected String assignSlot() {
        return null;
    }
}
