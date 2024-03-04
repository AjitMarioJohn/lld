package com.parking.lot.core.mapper.impl;

import com.parking.lot.core.domains.Floor;
import com.parking.lot.core.domains.commons.Identity;
import com.parking.lot.core.mapper.DomainMapper;
import com.parking.lot.infrastructure.entities.FloorsData;

import java.util.Objects;

public class FloorMapper implements DomainMapper<Floor, FloorsData> {

    @Override
    public FloorsData convertToEntity(Floor domain) {
        FloorsData floorsData = new FloorsData();
        if (!Objects.equals(domain.getId().getNumber(), Long.MIN_VALUE)) {
            floorsData.setId(domain.getId().getNumber());
        }
        floorsData.setFloorName(domain.getFloorName());
        floorsData.setFloorNumber(domain.getFloorNumber());
        floorsData.setActive(domain.isActive());
        return floorsData;
    }

    @Override
    public Floor convertToDomain(FloorsData entity) {
        return new Floor(new Identity(entity.getId()), entity.getFloorName(), entity.getFloorNumber(), entity.getActive());
    }
}
