package com.example.CarRentSpringFlyway.dto;

import com.example.CarRentSpringFlyway.entity.Audit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentalDto {

    private Long CarId;
    private Long RenterId;

    public Audit audit = new Audit();
}
