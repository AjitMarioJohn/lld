package com.parking.lot.core.domains.vehicles.impl;

import com.parking.lot.core.domains.vehicles.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String licenseNumber) {
        super(licenseNumber);
    }

    @Override
    protected String assignSlot() {
        return null;
    }
}
