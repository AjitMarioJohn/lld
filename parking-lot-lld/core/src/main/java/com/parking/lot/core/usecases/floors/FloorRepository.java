package com.parking.lot.core.usecases.floors;

import com.parking.lot.core.domains.Floor;
import com.parking.lot.core.domains.commons.Identity;

import java.util.List;
import java.util.Optional;

public interface FloorRepository {

    Floor persist(Floor floor);

    Optional<Floor> findById(Identity id);

    Optional<Floor> findByFloorName(String floorName);

    Optional<Floor> findByFloorNumber(String floorNumber);

    Optional<List<Floor>> fetchAllFloors();


}
