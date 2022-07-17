package com.example.vehicle.api.v1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.entities.Vehicle;
import com.example.vehicle.repositories.VehicleRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/vehicles")
public class VehicleRestController {
    
    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping("/")
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @PostMapping("/")
    public Vehicle save(@Valid @RequestBody Vehicle newVehicle) {
        Vehicle vehicle = vehicleRepository.save(newVehicle);
        vehicleRepository.updateVehicleCount(vehicle.getCategory().getId());
        return vehicle;
    }
}
