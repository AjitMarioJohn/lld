package com.parking.lot.presentation.rest.api.floor;

import com.parking.lot.core.usecases.floors.CreateFloorUseCase;
import com.parking.lot.core.usecases.UseCaseExecutor;
import com.parking.lot.presentation.rest.api.entities.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@RestController
@RequestMapping("/floors")
public class FloorsController implements FloorsResource {

    private final UseCaseExecutor useCaseExecutor;
    private final CreateFloorUseCase createFloorUseCase;

    @GetMapping
    @Override
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome");
    }

    @PostMapping
    @Override
    public CompletableFuture<ResponseEntity<ApiResponse<String>>> create(HttpServletRequest httpServletRequest,
                                                                 @Valid @RequestBody FloorRequest floorRequest) {
        return useCaseExecutor.execute(createFloorUseCase, FloorInputMapper.map(floorRequest),
                (output) -> FloorOutputMapper.mapForCreate(output, httpServletRequest));
    }
}
