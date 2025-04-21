package com.example.CarRentSpringFlyway.repository;

import com.example.CarRentSpringFlyway.entity.Renter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {
}
