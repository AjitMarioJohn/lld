package com.parking.lot.presentation.rest.api.floor;

import com.parking.lot.presentation.rest.api.entities.ApiResponse;
import com.parking.lot.presentation.rest.api.entities.FloorResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

public interface FloorsResource {
    public CompletableFuture<FloorResponse> fetchFloorByName(String name);

    CompletableFuture<ResponseEntity<ApiResponse<String>>> create(HttpServletRequest httpServletRequest,
                                                          FloorRequest floorRequest);


}
