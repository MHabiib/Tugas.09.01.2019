package com.future.jpa.service;

import com.future.jpa.model.Transaction;

public interface TransactionService {
    boolean createTransaction(Transaction transaction);
}
