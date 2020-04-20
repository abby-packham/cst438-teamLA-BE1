package cst438.fr.be1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst438.fr.be1.domain.FlightInfo;
import cst438.fr.be1.domain.FlightRepository;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public FlightInfo getAllFlights() {

        return null;
    }

}
