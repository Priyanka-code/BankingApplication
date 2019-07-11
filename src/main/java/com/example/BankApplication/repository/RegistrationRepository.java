/**
 * 
 */
package com.example.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankApplication.model.User;

/**
 * @author Administrator
 *
 */
public interface RegistrationRepository extends JpaRepository<User, Long>{

}
