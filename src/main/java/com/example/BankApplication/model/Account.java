package com.example.BankApplication.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="account")
@EntityListeners(AuditingEntityListener.class)
public class Account {

	@Id
	private Long accountNum;
	private String accountHolderName;
	private String balance;
	private String credit;
	private String debit;
	private Long userId;
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getDebit() {
		return debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Account(Long accountNum, String accountHolderName, String balance, String credit, String debit, Long userId) {
		super();
		this.accountNum = accountNum;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.credit = credit;
		this.debit = debit;
		this.userId = userId;
	}

	public Account() {
	}

}
