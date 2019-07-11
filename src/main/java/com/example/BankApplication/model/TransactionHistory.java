package com.example.BankApplication.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class TransactionHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long transNum;
	private Date transDate;
	private String transType;
	private Long accountNum;
	private int balance;
	private int credit;
	private int debit;
	
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
	
	
	public Long getTransNum() {
		return transNum;
	}
	public void setTransNum(Long transNum) {
		this.transNum = transNum;
	}
	
	
	public TransactionHistory(Long transNum, Date transDate, String transType, Long accountNum, int balance, int credit,
			int debit) {
		super();
		this.transNum = transNum;
		this.transDate = transDate;
		this.transType = transType;
		this.accountNum = accountNum;
		this.balance = balance;
		this.credit = credit;
		this.debit = debit;
	}
	public TransactionHistory() {}
}
