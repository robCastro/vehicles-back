package com.example.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle.entities.VehicleCategory;

public interface VehicleCategoryRepository extends JpaRepository<VehicleCategory, Long> {

}
