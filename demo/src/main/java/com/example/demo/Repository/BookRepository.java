package com.example.demo.Repository;

import com.example.demo.Entities.Booking;
import com.example.demo.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Booking,Long> {

}
