package com.parking.lot.presentation.rest.api.entities;

import com.parking.lot.core.domains.Floor;
import lombok.Value;

import java.util.List;

@Value
public class FloorResponse {
    Long id;
    String floorName;
    Long floorNUmber;
    boolean active;

    public static FloorResponse from(Floor floor) {
        return new FloorResponse(floor.getId().getNumber(), floor.getFloorName(),
                floor.getFloorNumber(), floor.isActive());
    }

    public static List<FloorResponse> from(List<Floor> floorList) {
        return floorList.stream().parallel().map(FloorResponse::from).toList();
    }
}
