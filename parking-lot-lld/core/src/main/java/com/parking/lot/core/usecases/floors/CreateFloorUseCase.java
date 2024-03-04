package com.parking.lot.core.usecases.floors;

import com.parking.lot.core.domains.Floor;
import com.parking.lot.core.domains.commons.Identity;
import com.parking.lot.core.usecases.UseCase;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor
public class CreateFloorUseCase extends UseCase<CreateFloorUseCase.Input, CreateFloorUseCase.Output> {

    private final FloorRepository floorRepository;

    @Override
    public Output execute(Input input) {
        Floor floor = floorRepository.persist(Floor.newInstance(Identity.nothing(), input.floorName, input.floorNumber, input.isActive()));

        return new Output(true, floor.getId().getNumber());
    }

    @Value
    public static class Input implements UseCase.Input {
        String floorName;
        Long floorNumber;
        boolean active;
    }

    @Value
    public static class Output implements UseCase.Output {
        boolean created;
        Long id;
    }

}
