package com.future.jpa.controller;

import com.future.jpa.model.Booking;
import com.future.jpa.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class BookingController {
        @Autowired
        BookingService bookingService;

        @GetMapping("/booking")
        public List<Booking> loadAll (){
            return bookingService.loadAll();
        }

        @PostMapping("/booking/create")
        public Booking createBooking(@RequestBody Booking booking) {
            return bookingService.createBooking(booking);
        }

        @PutMapping("/booking/{id}")
        public ResponseEntity<Booking> updateBooking(@PathVariable("id") int id, @RequestBody Booking booking) {
            return bookingService.updateBooking(id,booking);
        }

    }

