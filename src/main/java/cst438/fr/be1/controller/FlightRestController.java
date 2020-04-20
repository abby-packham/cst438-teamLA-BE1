package cst438.fr.be1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cst438.fr.be1.domain.FlightInfo;
import cst438.fr.be1.service.FlightService;

@RestController
public class FlightRestController {

    @Autowired
    private FlightService flightService;
    
    @GetMapping("/api/flights")
    public ResponseEntity<FlightInfo> getFlights() {
        FlightInfo flights = flightService.getAllFlights();
        if (flights == null) {
            return new ResponseEntity<FlightInfo>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<FlightInfo>(flights, HttpStatus.OK);
    }
}
