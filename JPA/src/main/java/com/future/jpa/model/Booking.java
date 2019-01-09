package com.future.jpa.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
    public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer memberId;
    private Integer driverId;
    private Double price;
}

