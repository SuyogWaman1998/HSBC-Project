package com.cg.hsbc.entity;

import java.sql.*;

import javax.persistence.*;
import javax.persistence.GenerationType;

@Entity
@Table(name="accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	
	private String accountType;
	
	private Double balance;
	
	private Date status;
	
	private Date dateCreated;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Account(Long accountId, String accountType, Double balance, Date status, Date dateCreated, User user) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.status = status;
		this.dateCreated = dateCreated;
		this.user = user;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getStatus() {
		return status;
	}

	public void setStatus(Date status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance + ", status="
				+ status + ", dateCreated=" + dateCreated + ", user=" + user + "]";
	}
	
	
	
}
