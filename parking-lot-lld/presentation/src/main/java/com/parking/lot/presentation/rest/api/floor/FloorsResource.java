package com.parking.lot.presentation.rest.api.floor;

import com.parking.lot.presentation.rest.api.entities.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

public interface FloorsResource {
    ResponseEntity<String> welcome();

    CompletableFuture<ResponseEntity<ApiResponse<String>>> create(HttpServletRequest httpServletRequest,
                                                          @Valid @RequestBody FloorRequest floorRequest);

}
