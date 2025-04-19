CREATE TABLE car_models (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    brand VARCHAR(255) NOT NULL,
    model_name VARCHAR(255) NOT NULL,
    year_of_production INT NOT NULL,
    colour VARCHAR(20) NOT NULL
);
