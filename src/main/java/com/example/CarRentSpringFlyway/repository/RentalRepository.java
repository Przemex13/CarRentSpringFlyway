package com.example.CarRentSpringFlyway.repository;

import com.example.CarRentSpringFlyway.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
