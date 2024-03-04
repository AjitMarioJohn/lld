package com.parking.lot.core.domains.parkinglots;

import com.parking.lot.core.domains.vehicles.Vehicle;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public abstract class ParkingLot {
    protected final String spotNumber;
    protected final String floor;
    protected LocalDateTime parkTime;
    private Vehicle vehicle;
    protected abstract boolean isSpotFree();
    protected void park() {
        parkTime = LocalDateTime.now();
    }

    protected void unpark() {
        parkTime = null;
    }
}
