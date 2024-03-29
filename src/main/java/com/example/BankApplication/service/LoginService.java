package com.example.BankApplication.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApplication.model.Account;
import com.example.BankApplication.model.User;
import com.example.BankApplication.repository.AccountRepository;
import com.example.BankApplication.repository.RegistrationRepository;

@Service
public class LoginService {

	private static List<User> users = new ArrayList<>();
	private SecureRandom random = new SecureRandom();

	@Autowired
	RegistrationRepository registrationRepository;
	@Autowired
	AccountRepository accountRepository;

	public List<User> retrieveAllUsers() {
		return users;
	}

	public Optional<User> retrieveUserInfo(Long userId) {
		Optional<User> user = registrationRepository.findById(userId);
		
		return user;
	}


	public Account addUser(User newUser) {

		registrationRepository.save(newUser);

		Account account = new Account();
		Long randomId = (Long)new BigInteger(11, random).longValue();
		account.setAccountNum(randomId);
		account.setUserId(newUser.getUserId());
		account.setAccountHolderName(newUser.getUserName());
		account.setBalance(10000);
		account.setCredit("0");
		account.setDebit("0");

		System.out.println("Saved user");

		accountRepository.save(account);

		System.out.println("Saved account");


		return account;
	}

	public Account retrieveAccountInfo(Long userId, String password) {
		Optional<User> user = this.retrieveUserInfo(userId);

		System.out.println("Inside service for login" +user);
		if (!(user==null)) {
			if(user.get().getPassword().equals(password)) {

				return accountRepository.findByUserId(userId);

			} else {
				return null;
			}
		} else {
			return null;
		}
	}
}
