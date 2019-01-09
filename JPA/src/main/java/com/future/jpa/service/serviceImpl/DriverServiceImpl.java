package com.future.jpa.service.serviceImpl;

import com.future.jpa.model.Driver;
import com.future.jpa.repository.DriverRepository;
import com.future.jpa.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverRepository driverRepository;
    
    @Override
    public List<Driver> loadAll() {
        return driverRepository.findAll();
    }

    @Override
    public Driver createDriver(Driver driver) {
        driverRepository.save(driver);
        driver.setId(driver.getId());
        driver.setBalance(driver.getBalance());
        driver.setName(driver.getName());
        driver.setStnk(driver.getStnk());
        return driverRepository.save(driver);
    }

    @Override
    public ResponseEntity<Driver> updateDriver(int id, Driver driver) {
            Driver driverData = driverRepository.findById(id);
            if (driver == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            driverData.setBalance(driver.getBalance());
            driverData.setStnk(driver.getStnk());
            driverData.setName(driver.getName());

            Driver updateddriver = driverRepository.save(driverData);
            return new ResponseEntity<>(updateddriver, HttpStatus.OK);
        }
    }


