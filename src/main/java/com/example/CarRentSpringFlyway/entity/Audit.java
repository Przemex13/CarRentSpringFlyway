package com.example.CarRentSpringFlyway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Embeddable
class Audit {
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name= "updated_on")
    private LocalDateTime updatedOn;
}
