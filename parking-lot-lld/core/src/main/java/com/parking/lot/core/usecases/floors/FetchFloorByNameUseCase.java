package com.parking.lot.core.usecases.floors;

import com.parking.lot.core.domains.Floor;
import com.parking.lot.core.exceptions.NotFoundException;
import com.parking.lot.core.usecases.UseCase;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor
public class FetchFloorByNameUseCase extends UseCase<FetchFloorByNameUseCase.Input, FetchFloorByNameUseCase.Output> {
    private final FloorRepository floorRepository;

    @Override
    public Output execute(Input input) {
        String name = input.getFloorName();
        return floorRepository.findByFloorName(name)
                .map(Output :: new)
                .orElseThrow(() -> new NotFoundException("Floor not found with name %s", name));
    }

    @Value
    public static class Input implements UseCase.Input {
        String floorName;
    }

    @Value
    public static class Output implements UseCase.Output {
        Floor floor;
    }
}
