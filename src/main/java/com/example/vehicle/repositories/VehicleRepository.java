package com.example.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.example.vehicle.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    /**
     * Contenido del sp:
     * 
     * PROCEDURE `vehicles`.`sp_update_vehicle_count`(IN category_id bigint)
     * 
     *   BEGIN
     * 
	 *   UPDATE vehicle_category set vehicles_count = (select count(*) from vehicle v where v.category_id = category_id) where id = category_id;
     * 
     *  END;
     * 
     */
    @Procedure("sp_update_vehicle_count")
    void updateVehicleCount(Long category_id);
}
