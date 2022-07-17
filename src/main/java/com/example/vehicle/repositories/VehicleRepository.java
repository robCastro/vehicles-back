package com.example.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.example.vehicle.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Procedure("sp_update_vehicle_count")
    void updateVehicleCount(Long category_id);
}
