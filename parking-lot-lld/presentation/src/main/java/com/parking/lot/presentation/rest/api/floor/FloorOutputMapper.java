package com.parking.lot.presentation.rest.api.floor;

import com.parking.lot.core.usecases.floors.CreateFloorUseCase;
import com.parking.lot.presentation.rest.api.entities.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public final class FloorOutputMapper {

    public static ResponseEntity<ApiResponse<String>> mapForCreate(CreateFloorUseCase.Output output, HttpServletRequest httpServletRequest) {
        URI location = ServletUriComponentsBuilder
                .fromContextPath(httpServletRequest)
                .path("/floors")
                .buildAndExpand(output.getId())
                .toUri();

        return ResponseEntity.created(location).body(new ApiResponse<>(HttpStatus.CREATED, "floor created successfully"));
    }

}
