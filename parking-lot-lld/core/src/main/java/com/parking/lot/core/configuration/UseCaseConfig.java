package com.parking.lot.core.configuration;

import com.parking.lot.core.mapper.impl.FloorMapper;
import com.parking.lot.core.usecases.floors.CreateFloorUseCase;
import com.parking.lot.core.usecases.floors.FloorRepository;
import com.parking.lot.core.usecases.floors.FloorRepositoryImpl;
import com.parking.lot.infrastructure.repositories.FloorsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public FloorMapper floorMapper() {
        return new FloorMapper();
    }

    @Bean
    public FloorRepository floorRepository(FloorsRepository floorsRepository, FloorMapper floorMapper) {
        return new FloorRepositoryImpl(floorsRepository, floorMapper);
    }

    @Bean
    public CreateFloorUseCase createFloorUseCase(FloorRepository floorRepository) {
        return new CreateFloorUseCase(floorRepository);
    }

}
