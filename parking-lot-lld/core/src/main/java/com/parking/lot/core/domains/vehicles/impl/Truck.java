package com.parking.lot.core.domains.vehicles.impl;

import com.parking.lot.core.domains.vehicles.Vehicle;

public class Truck extends Vehicle {
    public Truck(String licenseNumber) {
        super(licenseNumber);
    }

    @Override
    protected String assignSlot() {
        return null;
    }
}
