package com.future.jpa.service;

import com.future.jpa.model.Booking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookingService {
    List<Booking> loadAll();

    Booking createBooking(Booking booking);

    ResponseEntity<Booking> updateBooking(@PathVariable("id") int id, @RequestBody Booking booking);
}
