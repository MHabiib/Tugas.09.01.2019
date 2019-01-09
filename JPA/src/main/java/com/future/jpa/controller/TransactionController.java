package com.future.jpa.controller;

import com.future.jpa.model.Transaction;
import com.future.jpa.repository.BookingRepository;
import com.future.jpa.repository.DriverRepository;
import com.future.jpa.repository.MemberRepository;
import com.future.jpa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction/process")
    public boolean createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
}
