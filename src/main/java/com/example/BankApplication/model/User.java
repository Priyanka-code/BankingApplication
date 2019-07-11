package com.example.BankApplication.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="User")
@EntityListeners(AuditingEntityListener.class)
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String password;
	private String userName;
	private String email;
	private String phoneNo;
	private String pANNo;
	private String gender;
	private Date dateOfBirth;
	
	public Long getUserId() {
		return userId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getpANNo() {
		return pANNo;
	}
	public void setpANNo(String pANNo) {
		this.pANNo = pANNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public User(Long userId, String password, String userName, String email, String phoneNo, String pANNo, String gender,
			Date dateOfBirth) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.pANNo = pANNo;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public User() {
	}
}

