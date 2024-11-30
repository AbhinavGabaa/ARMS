package com.example.demo.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String email;
    private String contactNumber;

    @ManyToOne
    private Flight flight;

    private String seatClass; // Economy, Business, First Class
    private double totalPrice;

}
