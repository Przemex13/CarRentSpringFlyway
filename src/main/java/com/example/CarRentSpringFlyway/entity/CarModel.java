package com.example.CarRentSpringFlyway.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "car_models")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String modelName;
    private int yearOfProduction;
    private String colour;
//    jeden model samochodu, wiele egzemplarzy tego auta
//    cascade = CascadeType.All
// Atrybut cascade określa, jakie operacje (np. persist, remove, merge, refresh, detach)
// będą automatycznie propagowane z encji nadrzędnej (CarModel) na encje podrzędne (Car).
// CascadeType.ALL oznacza, że wszystkie operacje kaskadowe będą miały zastosowanie.
// Na przykład, jeśli zapiszesz lub usuniesz CarModel,
// wszystkie powiązane Car również zostaną zapisane lub usunięte.

//    orphanRemoval = false:
// Atrybut orphanRemoval kontroluje, co się stanie z podrzędnymi encjami,
// które nie są już powiązane z encją nadrzędną.
// Gdy orphanRemoval jest ustawione na false, oznacza to, że jeśli obiekt Car zostanie usunięty z kolekcji cars,
// nie zostanie on automatycznie usunięty z bazy danych. Musisz jawnie zarządzać jego usunięciem.
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = false, mappedBy = "carModel")
    @JsonBackReference
//    @JoinColumn(name = "cars", referencedColumnName = "id")
    private Set<Car> cars;

}
