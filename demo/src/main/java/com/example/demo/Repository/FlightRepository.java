package com.example.demo.Repository;

import com.example.demo.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureLocationAndArrivalLocation(String departure, String arrival);
}
