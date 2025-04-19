package com.example.CarRentSpringFlyway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarModelDto {

    private String brand;
    private String modelName;
    private int yearOfProduction;
    private String colour;

}
