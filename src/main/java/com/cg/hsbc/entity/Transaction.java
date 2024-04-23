package com.cg.hsbc.entity;

import javax.persistence.*;

@Entity
@Table(name= "transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	
	private String type;
	
	private Double ammount;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name= "sender_account_id")
	private Account senderAccount;
	
	@ManyToOne
	@JoinColumn(name= "reciver_account_id")
	private Account reciverAccount;

	public Transaction(Long transactionId, String type, Double ammount, String description, Account senderAccount,
			Account reciverAccount) {
		super();
		this.transactionId = transactionId;
		this.type = type;
		this.ammount = ammount;
		this.description = description;
		this.senderAccount = senderAccount;
		this.reciverAccount = reciverAccount;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Account getSenderAccount() {
		return senderAccount;
	}

	public void setSenderAccount(Account senderAccount) {
		this.senderAccount = senderAccount;
	}

	public Account getReciverAccount() {
		return reciverAccount;
	}

	public void setReciverAccount(Account reciverAccount) {
		this.reciverAccount = reciverAccount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", type=" + type + ", ammount=" + ammount
				+ ", description=" + description + ", senderAccount=" + senderAccount + ", reciverAccount="
				+ reciverAccount + "]";
	}
	
	
	

}
