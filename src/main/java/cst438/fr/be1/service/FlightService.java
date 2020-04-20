package cst438.fr.be1.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst438.fr.be1.domain.Flight;
import cst438.fr.be1.domain.FlightInfo;
import cst438.fr.be1.domain.FlightRepository;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public FlightInfo getAllFlights() {
        List<Flight> flights = new ArrayList<Flight>();
        flights = this.flightRepository.findAll();
        FlightInfo flightInfo = new FlightInfo();
        flightInfo.setFlights(flights);
        return flightInfo;
    }
    
    public void addFlights() {
        //TODO: Add more test data
        String flightNumber = "123";
        String operatingAirlines = "SouthWest";
        String departureCity = "LAX";
        String arrivalCity = "SFO";
        Date dateOfDeparture = new Date();
        Date dateOfArrival = new Date();
        Timestamp estimatedDepartureTime = null;
        Flight flight = new Flight(flightNumber, operatingAirlines, departureCity, arrivalCity,
                dateOfDeparture, dateOfArrival, estimatedDepartureTime);
        
        this.flightRepository.save(flight);
        
        flightNumber = "453";
        operatingAirlines = "American";
        departureCity = "LAS";
        arrivalCity = "LAX";
        dateOfDeparture = new Date();
        dateOfArrival = new Date();
        estimatedDepartureTime = null;
        flight = new Flight(flightNumber, operatingAirlines, departureCity, arrivalCity,
                dateOfDeparture, dateOfArrival, estimatedDepartureTime);
        
        this.flightRepository.save(flight);
        
    }

    public void deleteAllFlights() {
        flightRepository.deleteAll();
    }

}
