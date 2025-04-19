package com.example.CarRentSpringFlyway.service;

import com.example.CarRentSpringFlyway.entity.CarModel;
import com.example.CarRentSpringFlyway.repository.CarModelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CarModelService {

    private final CarModelRepository carModelRepository;


    public CarModelService(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
        Logger logger1 = LoggerFactory.getLogger(CarModelService.class);
    }

    public CarModel saveCarModel(CarModel carModel){
        return this.carModelRepository.save(carModel);
    }
}
