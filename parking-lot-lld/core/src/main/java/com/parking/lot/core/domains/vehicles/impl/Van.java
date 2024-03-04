package com.parking.lot.core.domains.vehicles.impl;

import com.parking.lot.core.domains.vehicles.Vehicle;

public class Van extends Vehicle {
    public Van(String licenseNumber) {
        super(licenseNumber);
    }

    @Override
    protected String assignSlot() {
        return null;
    }
}
