package com.example.BankApplication.service;

import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

import org.hibernate.type.DateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApplication.model.Account;
import com.example.BankApplication.model.TransactionHistory;
import com.example.BankApplication.model.Transfer;
import com.example.BankApplication.repository.AccountRepository;
import com.example.BankApplication.repository.TransactionHistoryRepository;

@Service
public class FundTransferService extends Exception{
	
	@Autowired
	TransactionHistoryRepository transactionHistoryRepository;
	AccountRepository accountRepository;
	
	public String fundTransferService(Transfer transfer) {
		String result = "SUCCESS!!!";
		
		Account accountPayer = accountRepository.findByAccountNum(transfer.getFromAccount());
		Account accountPayee = accountRepository.findByAccountNum(transfer.getToAccount());
		
		System.out.println("Payer account details " +accountPayer);
		
		accountPayer.setBalance(accountPayer.getBalance()-transfer.getTransAmount());
		accountPayee.setBalance(accountPayee.getBalance()+transfer.getTransAmount());
		
		
		
		
		TransactionHistory transactionHistory = new TransactionHistory(); 
		//Payer
		transactionHistory.setAccountNum((long) transfer.getFromAccount());
		transactionHistory.setBalance(accountPayer.getBalance()-transfer.getTransAmount());
		transactionHistory.setCredit(0);
		transactionHistory.setDebit(transfer.getTransAmount());
		//transactionHistory.setTransDate();
		transactionHistory.setTransNum((long) transfer.getTransId());
		transactionHistory.setTransType("DEBIT");
		
		
		
		TransactionHistory transactionHistory1 = new TransactionHistory(); 
		//Payee
		transactionHistory1.setAccountNum((long) transfer.getToAccount());
		transactionHistory1.setBalance(accountPayee.getBalance()+transfer.getTransAmount());
		transactionHistory1.setCredit(transfer.getTransAmount());
		transactionHistory1.setDebit(0);
		//transactionHistory.setTransDate();
		transactionHistory1.setTransNum((long) transfer.getTransId());
		transactionHistory1.setTransType("CREDIT");
		
		try {
		accountRepository.save(accountPayer);
		accountRepository.save(accountPayee);
		transactionHistoryRepository.save(transactionHistory);
		transactionHistoryRepository.save(transactionHistory1);
		}
		catch(Exception e){
		System.out.println("Error in transaction "  +e);
		
		return "TRANSACTION FAILED";
		}

		return result;
	}

}
