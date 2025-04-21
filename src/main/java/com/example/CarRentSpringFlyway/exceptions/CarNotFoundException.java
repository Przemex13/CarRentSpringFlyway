package com.example.CarRentSpringFlyway.exceptions;

public class CarNotFoundException extends RuntimeException{

    public CarNotFoundException(Long id){
        super("Could not find car id: " + id);
    }
}
