package com.example.CarRentSpringFlyway.controller;

import com.example.CarRentSpringFlyway.dto.CarDto;
import com.example.CarRentSpringFlyway.entity.Car;
import com.example.CarRentSpringFlyway.service.CarService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    private static final Logger logger = LoggerFactory.getLogger(CarController.class);

    public CarController(CarService carService) {
        this.carService = carService;

    }

//    get

    @GetMapping("/przemas")
    String metoda(){
        return "Przemo mistrz";
    }



    //    add new car

    @PostMapping("/add")
    public ResponseEntity<Car> addCarModel (@RequestBody CarDto dto){

        Car car = Car.builder()
                .brand(dto.getBrand())
                .modelName(dto.getModelName())
                .registrationNumber(dto.getRegistrationNumber())
                .yearOfProduction(dto.getYearOfProduction())
                .colour(dto.getColour())
                .build();

        Car saved = carService.saveCar(car);

        return ResponseEntity.ok(saved);
    }

    //    delete car
    @DeleteMapping("delete/{id}")
    void deleteCar (@PathVariable Long id){
        carService.deleteCar(id);
    }


    //    update car
    @PutMapping("update/{id}")
    ResponseEntity<Car>updateCar(@RequestBody Car modifiedCar,@PathVariable Long id){

        Car car = Car.builder()
                .id(id)
                .brand(modifiedCar.getBrand())
                .modelName(modifiedCar.getModelName())
                .registrationNumber(modifiedCar.getRegistrationNumber())
                .yearOfProduction(modifiedCar.getYearOfProduction())
                .colour(modifiedCar.getColour())
                .build();

        Car carUpdated = carService.saveCar(car);

        return ResponseEntity.ok(carUpdated);
    }


}