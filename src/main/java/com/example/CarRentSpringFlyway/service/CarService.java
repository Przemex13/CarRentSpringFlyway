package com.example.CarRentSpringFlyway.service;

import com.example.CarRentSpringFlyway.entity.Car;
import com.example.CarRentSpringFlyway.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

//    private static final Logger logger = LoggerFactory.getLogger(CarService.class);


    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
        Logger logger1 = LoggerFactory.getLogger(CarService.class);
    }


    public List<Car> findAllCarsService(){
        return carRepository.findAll();
    }
    public List<Car> findCarModelService(Long id){
        return carRepository.findCarsByModel(id);
    }
    public List<Car> findCarsAvailabilityService(String carStatus){
        return carRepository.findCarsByStatus(carStatus.toUpperCase());
    }
    public List<Car> showCarsByModelAndStatusService(Long idModel, String carStatus){
        return carRepository.findCarsByModelAndStatus(idModel, carStatus.toUpperCase());
    }

    public Optional<Car> findCarByIdService(Long carId){
        return carRepository.findById(carId);
    }
}
