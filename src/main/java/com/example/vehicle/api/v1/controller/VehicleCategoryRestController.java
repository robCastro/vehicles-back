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

import com.example.vehicle.entities.VehicleCategory;
import com.example.vehicle.repositories.VehicleCategoryRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/vehicle-categories/")
public class VehicleCategoryRestController {

    @Autowired
    private VehicleCategoryRepository categoryRepository;

    @GetMapping("/")
    public List<VehicleCategory> findAll() {
        return categoryRepository.findAll();
    }

    @PostMapping("/")
    public VehicleCategory save(@Valid @RequestBody VehicleCategory newCategory) {
        VehicleCategory category = categoryRepository.save(newCategory);
        return category;
    }

}
