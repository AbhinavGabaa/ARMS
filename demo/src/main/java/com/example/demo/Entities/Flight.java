package com.example.demo.Entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Table(name= "flights")
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private String airline;
    private String departureLocation;
    private String arrivalLocation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;
    private double price;
}
