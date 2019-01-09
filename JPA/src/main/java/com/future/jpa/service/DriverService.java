package com.future.jpa.service;

import com.future.jpa.model.Driver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DriverService {
    List<Driver> loadAll();

    Driver createDriver(Driver driver);

    ResponseEntity<Driver> updateDriver(@PathVariable("id") int id,@RequestBody
    Driver driver);
}
