package com.parking.lot.presentation.rest.api.floor;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class FloorRequest {
    @NotNull
    @NotEmpty
    String floorName;
    @NotNull
    Long floorNumber;
    boolean active = true;
}
