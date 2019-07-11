package com.example.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BankApplication.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	//@Query(value="Select a from user u, account a where u.userid= a.userid and u.userid =:userId ")
	//Account getAccounts(@Param("userId") Long userId);
	
	public Account findByUserId(Long userId);

	public Account findByAccountNum(int fromAccount);

}
