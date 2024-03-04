package com.parking.lot.core.domains.parkinglots.impl;

import com.parking.lot.core.domains.parkinglots.ParkingLot;

public class Motorcycle extends ParkingLot {
    public Motorcycle(String spotNumber, String floor) {
        super(spotNumber, floor);
    }

    @Override
    protected boolean isSpotFree() {
        return false;
    }
}
