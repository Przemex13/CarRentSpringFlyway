package com.example.CarRentSpringFlyway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Embeddable
public class Audit {
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name= "updated_on")
    private LocalDateTime updatedOn;

    @PrePersist
    void prePersist (){
        createdOn = LocalDateTime.now();
    }

    @PreUpdate
    void preMerge() {
        updatedOn = LocalDateTime.now();
    }
}
