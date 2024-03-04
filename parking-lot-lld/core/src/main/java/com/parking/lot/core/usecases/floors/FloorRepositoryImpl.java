package com.parking.lot.core.usecases.floors;

import com.parking.lot.core.domains.Floor;
import com.parking.lot.core.domains.commons.Identity;
import com.parking.lot.core.mapper.impl.FloorMapper;
import com.parking.lot.infrastructure.entities.FloorsData;
import com.parking.lot.infrastructure.repositories.FloorsRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class FloorRepositoryImpl implements FloorRepository{

    private final FloorsRepository floorsRepository;
    private final FloorMapper floorMapper;

    @Override
    public Floor persist(Floor floor) {
        FloorsData floorsData = floorsRepository.save(floorMapper.convertToEntity(floor));
        return floorMapper.convertToDomain(floorsData);
    }

    @Override
    public Optional<Floor> findById(Identity id) {
        return Optional.empty();
    }

    @Override
    public Optional<Floor> findByFloorName(String floorName) {
        return Optional.empty();
    }

    @Override
    public Optional<Floor> findByFloorNumber(String floorNumber) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Floor>> fetchAllFloors() {
        return Optional.empty();
    }


}
