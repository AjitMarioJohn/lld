package com.parking.lot.core.domains.parkinglots.impl;

import com.parking.lot.core.domains.parkinglots.ParkingLot;

public class Compact extends ParkingLot {
    public Compact(String spotNumber, String floor) {
        super(spotNumber, floor);
    }

    @Override
    protected boolean isSpotFree() {
        return false;
    }
}
