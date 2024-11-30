package com.example.demo.Service;

import com.example.demo.Entities.Booking;
import com.example.demo.Entities.Flight;
import com.example.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookRepository bookingRepository;


    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

}
