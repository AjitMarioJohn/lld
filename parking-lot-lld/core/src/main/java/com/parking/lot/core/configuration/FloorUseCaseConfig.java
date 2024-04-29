package com.parking.lot.core.configuration;

import com.parking.lot.core.mapper.impl.FloorMapper;
import com.parking.lot.core.usecases.floors.CreateFloorUseCase;
import com.parking.lot.core.usecases.floors.FetchFloorByNameUseCase;
import com.parking.lot.core.usecases.floors.FloorRepository;
import com.parking.lot.core.usecases.floors.FloorRepositoryImpl;
import com.parking.lot.infrastructure.repositories.FloorsDataRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FloorUseCaseConfig {

    @Bean
    public FloorMapper floorMapper() {
        return new FloorMapper();
    }

    @Bean
    public FloorRepository floorRepository(FloorsDataRepository floorsDataRepository, FloorMapper floorMapper) {
        return new FloorRepositoryImpl(floorsDataRepository, floorMapper);
    }

    @Bean
    public CreateFloorUseCase createFloorUseCase(FloorRepository floorRepository) {
        return new CreateFloorUseCase(floorRepository);
    }

    @Bean
    public FetchFloorByNameUseCase fetchFloorByNameUseCase(FloorRepository floorRepository) {
        return new FetchFloorByNameUseCase(floorRepository);
    }

}
