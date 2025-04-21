package com.example.CarRentSpringFlyway.service;

import com.example.CarRentSpringFlyway.entity.Renter;
import com.example.CarRentSpringFlyway.repository.RenterRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RenterService {

    private final RenterRepository renterRepository;

    RenterService(RenterRepository renterRepository) {
        this.renterRepository = renterRepository;
    }

    public Optional<Renter> findRenterById(Long id){
        return renterRepository.findById(id);
    }
    public Renter saveRenter (Renter renter){
        return renterRepository.save(renter);
    }
    public void deleteRenter(Long id){
        renterRepository.deleteById(id);
    }

}
