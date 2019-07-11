package com.example.BankApplication.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApplication.model.Account;
import com.example.BankApplication.model.Transfer;
import com.example.BankApplication.model.User;
import com.example.BankApplication.service.FundTransferService;

@RestController
public class FundTransferController {
	
	@Autowired
	FundTransferService fundTransferService;
	@PutMapping("/users/fundtransfer")
	public String fundTransfer(@Valid @RequestBody Transfer transfer) {

	    System.out.println("Inside Controller for fund transfer");
			return fundTransferService.fundTransferService(transfer);
		} 

	
	

}
