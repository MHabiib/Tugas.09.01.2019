package com.future.jpa.controller;

import com.future.jpa.model.Booking;
import com.future.jpa.model.Driver;
import com.future.jpa.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DriverController {
    @Autowired
    DriverService driverService;

    @GetMapping("/driver")
    public List<Driver> loadAll (){
        return driverService.loadAll();
    }

    @PostMapping("/driver/create")
    public Driver createDriver(@RequestBody Driver booking) {
        return driverService.createDriver(booking);
    }

    @PutMapping("/driver/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable("id") int id, @RequestBody Driver driver) {
        return driverService.updateDriver(id,driver);
    }
}
