package com.example.CarRentSpringFlyway.repository;

import com.example.CarRentSpringFlyway.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
