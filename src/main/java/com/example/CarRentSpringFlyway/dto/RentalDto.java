package com.example.CarRentSpringFlyway.dto;

import com.example.CarRentSpringFlyway.entity.Audit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentalDto {

    private Long CarId;
    private Long RenterId;
    private LocalDate rentDate;
    private LocalDate returnDate;

    public Audit audit = new Audit();
}
