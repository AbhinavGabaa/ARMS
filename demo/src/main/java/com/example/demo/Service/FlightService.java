package com.example.demo.Service;

import com.example.demo.Entities.Flight;
import com.example.demo.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> searchFlights(String departure, String arrival) {
        return flightRepository.findByDepartureLocationAndArrivalLocation(departure, arrival);
    }
}



