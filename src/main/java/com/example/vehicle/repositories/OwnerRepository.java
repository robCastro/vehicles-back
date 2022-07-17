package com.example.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
