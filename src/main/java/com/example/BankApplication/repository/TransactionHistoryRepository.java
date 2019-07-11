package com.example.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankApplication.model.TransactionHistory;
import com.example.BankApplication.model.Transfer;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<Transfer, Long> {

	String save(TransactionHistory transactionHistory);

}
