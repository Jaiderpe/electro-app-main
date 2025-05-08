package com.electroapp.electro_app.infrastructure.repository.country;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electroapp.electro_app.domain.entities.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
    // Custom query methods can be defined here if needed

}
