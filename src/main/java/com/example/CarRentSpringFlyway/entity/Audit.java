package com.example.CarRentSpringFlyway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
class Audit {
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name= "updated_on")
    private LocalDateTime updatedOn;
}
