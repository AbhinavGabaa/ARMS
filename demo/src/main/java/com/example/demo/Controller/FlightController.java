package com.example.demo.Controller;

import com.example.demo.Entities.Flight;
import com.example.demo.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/search")
    public List<Flight> searchFlights(@RequestParam String departure, @RequestParam String arrival) {
        return flightService.searchFlights(departure, arrival);
    }
}
