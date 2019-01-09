package com.future.jpa.service.serviceImpl;

import com.future.jpa.model.Booking;
import com.future.jpa.repository.BookingRepository;
import com.future.jpa.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> loadAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking createBooking(Booking booking) {
        bookingRepository.save(booking);
        booking.setId(booking.getId());
        booking.setDriverId(booking.getDriverId());
        booking.setMemberId(booking.getMemberId());
        booking.setPrice(booking.getPrice());
        return bookingRepository.save(booking);
    }

    @Override
    public ResponseEntity<Booking> updateBooking(int id, Booking booking) {
            Booking bookingData = bookingRepository.findById(id);
            if (booking == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            bookingData.setPrice(booking.getPrice());
            bookingData.setMemberId(booking.getMemberId());
            bookingData.setDriverId(booking.getMemberId());

            Booking updatedbooking = bookingRepository.save(bookingData);
            return new ResponseEntity<>(updatedbooking, HttpStatus.OK);
        }
    }

