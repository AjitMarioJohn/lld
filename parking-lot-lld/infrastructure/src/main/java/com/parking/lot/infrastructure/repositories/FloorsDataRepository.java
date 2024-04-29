package com.parking.lot.infrastructure.repositories;

import com.parking.lot.infrastructure.entities.FloorsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FloorsDataRepository extends JpaRepository<FloorsData, Long> {
    Optional<FloorsData> findByFloorName(String floorName);
    Optional<FloorsData> findByFloorNumber(Long floorNumber);
}
