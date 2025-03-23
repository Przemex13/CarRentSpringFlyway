package com.example.CarRentSpringFlyway.repository;

import com.example.CarRentSpringFlyway.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long> {

}
