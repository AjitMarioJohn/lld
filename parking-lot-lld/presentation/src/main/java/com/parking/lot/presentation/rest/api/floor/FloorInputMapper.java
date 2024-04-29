package com.parking.lot.presentation.rest.api.floor;

import com.parking.lot.core.usecases.floors.CreateFloorUseCase;

public class FloorInputMapper {

    public static CreateFloorUseCase.Input mapForCreate(FloorRequest floorRequest) {
        return new CreateFloorUseCase.Input(floorRequest.getFloorName(), floorRequest.getFloorNumber(), floorRequest.isActive());
    }

}
