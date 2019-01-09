package com.future.jpa.repository;

import com.future.jpa.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Integer> {
    Driver findById(int id);
    Driver findByStnk(String stnk);
}
