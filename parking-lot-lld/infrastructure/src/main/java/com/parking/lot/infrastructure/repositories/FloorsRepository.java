package com.parking.lot.infrastructure.repositories;

import com.parking.lot.infrastructure.entities.FloorsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorsRepository extends JpaRepository<FloorsData, Long> {
}
