CarRentSpringFlyway 🚗
------------------
Polska wersja na dole
------------------

CarRentSpringFlyway is a sample web application (REST API) built with Java using Spring Boot, Hibernate (JPA), Flyway, and Maven. 
The project simulates a simple car rental system.

Features:
Registering car models and individual cars.
Managing renters and linking them to rented vehicles.
Full CRUD operations on cars, models, and renters via REST API.
Automatic database migration management using Flyway.

Technologies:
Java 17
Spring Boot
Spring Data JPA
Flyway (database migrations)
Lombok (boilerplate code reduction)
Maven (project management)
H2 Database (in-memory, for development)

How to Run:

Clone the repository:
git clone https://github.com/Przemex13/CarRentSpringFlyway.git

Navigate to the project directory:
cd CarRentSpringFlyway

Run the application:
./mvnw spring-boot:run

Access the H2 console at: http://localhost:8080/h2-console

Sample Endpoints:
Add a model: POST /api/models
Add a car: POST /api/cars
Add a renter: POST /api/renters
Rent a car: POST /api/rentals

Notes:
The project serves as a portfolio piece and a base for further development, such as adding car return functionality or payment processing.
The database resets with each application restart (H2 In-Memory).

------------------
Polska wersja
------------------

CarRentSpringFlyway 🚗
CarRentSpringFlyway to przykładowa aplikacja webowa typu REST API stworzona w Javie przy użyciu Spring Boot, Hibernate (JPA), Flyway oraz Maven. 
Projekt symuluje prosty system wypożyczalni samochodów.

Funkcjonalności:
Rejestracja modeli samochodów i pojedynczych samochodów.
Obsługa klientów (renterów) i ich powiązania z wypożyczonymi pojazdami.
Operacje CRUD na samochodach, modelach i klientach poprzez REST API.
Automatyczne zarządzanie migracjami bazy danych za pomocą Flyway.

Technologie:
Java 17
Spring Boot
Spring Data JPA
Flyway (migracje baz danych)
Lombok (redukcja boilerplate'u)
Maven (zarządzanie projektem)
H2 Database (w pamięci, dla środowiska deweloperskiego)

Jak uruchomić:
Sklonuj repozytorium:

git clone https://github.com/Przemex13/CarRentSpringFlyway.git

Przejdź do katalogu projektu:
cd CarRentSpringFlyway

Uruchom aplikację:
./mvnw spring-boot:run

Konsola H2 dostępna będzie pod adresem: http://localhost:8080/h2-console

Przykładowe endpointy:
Dodawanie modelu: POST /api/models
Dodawanie samochodu: POST /api/cars
Dodawanie klienta: POST /api/renters
Wypożyczenie samochodu: POST /api/rentals

Uwagi:
Projekt służy jako portfolio oraz baza do dalszego rozwoju np. o funkcje zwrotu samochodu czy obsługi płatności.

Baza danych resetuje się przy każdym restarcie (H2 In-Memory).
