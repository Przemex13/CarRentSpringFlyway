package com.example.CarRentSpringFlyway.controller;

import com.example.CarRentSpringFlyway.entity.Car;
import com.example.CarRentSpringFlyway.repository.CarRepository;
import com.example.CarRentSpringFlyway.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private static final Logger logger = LoggerFactory.getLogger(CarController.class);
    private final CarService carService;
    private final CarRepository carRepository;

    CarController(CarService carService, CarRepository carRepository) {
        this.carService = carService;
        this.carRepository = carRepository;
        Logger logger = LoggerFactory.getLogger(CarController.class);

    }
    //----------------------------------GETS----------------------------------------------------------------------------

    @GetMapping("/przemas")
    String metoda(){
        return "Przemo mistrz";
    }

    @GetMapping("showAll")
    ResponseEntity<List<Car>> showAllCars(){
        logger.info("Eksponuje wszystkie auta!");
        return ResponseEntity.ok(carService.findAllCarsService());
    }
    @GetMapping("/model/{id}")
    ResponseEntity<List<Car>> showCarModel(@PathVariable Long id){
        logger.info("pokazuje auto z id: " + id );
        return ResponseEntity.ok(carService.findCarModelService(id));
    }
    @GetMapping("showAll/{status}")
    ResponseEntity<List<Car>> showAllCarsByStatus(@PathVariable String status){
        logger.info("Pokazuje wszystkie auta o statusie: " + status);
        return ResponseEntity.ok(carService.findCarsAvailabilityService(status));
    }
    @GetMapping("{idModel}/{status}")
    ResponseEntity<List<Car>> showAllCarsByModelAndStatus(@PathVariable Long idModel, @PathVariable String status){
        logger.info("Pokazuje wszystkie auta o modelu: " + idModel + " i statusie: " + status);
        return ResponseEntity.ok(carService.showCarsByModelAndStatusService(idModel, status));
    }

    //-------------------------------POSTS----------------------------------------------------------------------------

}
