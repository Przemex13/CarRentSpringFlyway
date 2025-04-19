package com.example.CarRentSpringFlyway.controller;

import com.example.CarRentSpringFlyway.dto.CarModelDto;
import com.example.CarRentSpringFlyway.entity.CarModel;
import com.example.CarRentSpringFlyway.service.CarModelService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/cars")
public class CarModelController {

    private final CarModelService carModelService;
    private static final Logger logger = LoggerFactory.getLogger(CarModelController.class);

    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;

    }

    //----------------------------------GETS----------------------------------------------------------------------------

    @GetMapping("/przemas")
    String metoda(){
        return "Przemo mistrz";
    }

    //-------------------------------POSTS----------------------------------------------------------------------------

    //    add new car model


    @PostMapping("/add")
    public ResponseEntity<CarModel> addCarModel (@RequestBody CarModelDto dto){

        CarModel carModel = CarModel.builder()
                .brand(dto.getBrand())
                .modelName(dto.getModelName())
                .yearOfProduction(dto.getYearOfProduction())
                .colour(dto.getColour())
                .build();

        CarModel saved = carModelService.saveCarModel(carModel);

        return ResponseEntity.ok(saved);
    }

}