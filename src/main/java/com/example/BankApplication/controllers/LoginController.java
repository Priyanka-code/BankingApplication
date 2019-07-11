package com.example.BankApplication.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApplication.model.Account;
import com.example.BankApplication.model.User;
import com.example.BankApplication.service.LoginService;

@RestController
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/users/{userId}")
	public User retrieveUserInfo(@PathVariable Long userId) {
	    System.out.println("Inside Controller for user info");

		return loginService.retrieveUserInfo(userId);
	}

	@PostMapping("/users/new")
	public Account registerUser(@Valid @RequestBody User newUser) {

    System.out.println("Inside Controller for new user");
		return loginService.addUser(newUser);
	}

	public List<User> retrieveAllUsers() {
		List<User> users = new ArrayList<>();
	    System.out.println("Inside Controller for all user info");

		return loginService.retrieveAllUsers();
	}
	
	@GetMapping("/users/login/{userId}/{password}")
	public Account loginUser(@PathVariable Long userId, String password) {
		
		System.out.println("Inside Controller for account info after login");
		
		return loginService.retrieveAccountInfo(userId, password);
	}
}


