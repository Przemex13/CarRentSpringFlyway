CREATE TABLE cars (
--    to jest deklaracja pola jako klucza głównego, trochę opornie i nie intuicyjnie jak na bazę w H2
    id BIGINT NOT NULL PRIMARY KEY,
    registration_plate VARCHAR(20) NOT NULL,
    vin_number VARCHAR(17) NOT NULL,
    car_status VARCHAR(20) NOT NULL,
    id_model BIGINT NOT NULL,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
