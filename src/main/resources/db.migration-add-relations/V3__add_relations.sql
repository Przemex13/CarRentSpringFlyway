ALTER TABLE cars

-- opcja ON DELETE CASCADE powoduje, że jeżeli będzie usunięty rekord tabeli nadrzędnej to automatycznie usunie rekord
-- tabeli powiązanej
--    ADD FOREIGN KEY (id_model) REFERENCES car_models(id) ON DELETE CASCADE;
    ADD FOREIGN KEY (id_model) REFERENCES car_models(id);
    ALTER TABLE cars ADD COLUMN car_model_id bigint;

