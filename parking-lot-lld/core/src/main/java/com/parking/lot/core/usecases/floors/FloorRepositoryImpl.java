package com.parking.lot.core.usecases.floors;

import com.parking.lot.core.domains.Floor;
import com.parking.lot.core.domains.commons.Identity;
import com.parking.lot.core.mapper.impl.FloorMapper;
import com.parking.lot.infrastructure.entities.FloorsData;
import com.parking.lot.infrastructure.repositories.FloorsDataRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class FloorRepositoryImpl implements FloorRepository{

    private final FloorsDataRepository floorsDataRepository;
    private final FloorMapper floorMapper;

    @Override
    public Floor persist(Floor floor) {
        FloorsData floorsData = floorsDataRepository.save(floorMapper.convertToEntity(floor));
        return floorMapper.convertToDomain(floorsData);
    }

    @Override
    public Optional<Floor> findById(Identity id) {
        Objects.requireNonNull(id, "Id can't be null");
        Optional<FloorsData> floorsDataOptional = floorsDataRepository.findById(id.getNumber());
        return floorsDataOptional.map(floorMapper :: convertToDomain);
    }

    @Override
    public Optional<Floor> findByFloorName(String floorName) {
        Objects.requireNonNull(floorName, "floorName can't be null");
        Optional<FloorsData> floorsDataOptional = floorsDataRepository.findByFloorName(floorName);
        return floorsDataOptional.map(floorMapper :: convertToDomain);
    }

    @Override
    public Optional<Floor> findByFloorNumber(Long floorNumber) {
        Objects.requireNonNull(floorNumber, "floorName can't be null");
        Optional<FloorsData> floorsDataOptional = floorsDataRepository.findByFloorNumber(floorNumber);
        return floorsDataOptional.map(floorMapper :: convertToDomain);
    }

    @Override
    public List<Floor> fetchAllFloors() {
        List<FloorsData> floorsDatas = floorsDataRepository.findAll();
        return floorsDatas.stream().parallel().map(floorMapper :: convertToDomain).collect(Collectors.toList());
    }


}
