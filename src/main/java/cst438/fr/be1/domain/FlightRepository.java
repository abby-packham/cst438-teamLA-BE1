package cst438.fr.be1.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {	
    Flight findByFlightNumber(String flightNumber);
}
