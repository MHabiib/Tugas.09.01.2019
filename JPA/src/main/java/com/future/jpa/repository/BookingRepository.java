package com.future.jpa.repository;

import com.future.jpa.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository  extends JpaRepository<Booking, Integer> {
    Booking findById(int id);
}