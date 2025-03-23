package com.example.CarRentSpringFlyway.repository;

import com.example.CarRentSpringFlyway.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllById(Long id);

    @Query(value = "SELECT * FROM cars WHERE id_model = :idModel", nativeQuery = true)
   public List<Car> findCarsByModel(@Param("idModel") Long idModel);

    @Query(value = "SELECT * FROM cars where car_status = :status", nativeQuery = true)
    public List<Car> findCarsByStatus(@Param("status") String status);

    @Query(value = "SELECT * FROM cars where id_model= :model AND car_status = :status" , nativeQuery = true)
    public List<Car> findCarsByModelAndStatus(@Param("model") Long id,@Param("status") String status);


}
