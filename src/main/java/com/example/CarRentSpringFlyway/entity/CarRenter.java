package com.example.CarRentSpringFlyway.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car_renter")
public class CarRenter {
    @Id
    private long id;
    String name;
    String surname;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(unique = true)
    Car possesedCar;
}
