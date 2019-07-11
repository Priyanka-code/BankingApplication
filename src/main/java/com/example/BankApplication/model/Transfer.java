package com.example.BankApplication.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transfer")
public class Transfer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transId;
	private int transAmount;
	private int toAccount;
	private int fromAccount;
	private Date transDate;

	
	public int getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(int transAmount) {
		this.transAmount = transAmount;
	}
		

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public int getToAccount() {
		return toAccount;
	}

	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}

	public int getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public Transfer(int transId, int transAmount, int toAccount, int fromAccount, Date transDate) {
		super();
		this.transId = transId;
		this.transAmount = transAmount;
		this.toAccount = toAccount;
		this.fromAccount = fromAccount;
		this.transDate = transDate;
	}
	
	public Transfer() {
		
	}
	

}
