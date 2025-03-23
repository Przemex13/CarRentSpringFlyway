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
@Table(name = "cars", uniqueConstraints = {@UniqueConstraint(columnNames = "registration_plate")})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String registrationPlate;
    private String vinNumber;
    @Enumerated(EnumType.STRING)
    private CarStatus carStatus;
// będzie zaciągą leiwie- co nie musi to nie pobierze z  bazy
// wiele Car dla jednego CarModel
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(nullable = false)
    private CarModel carModel;
    @Embedded
    public Audit audit = new Audit();

}
