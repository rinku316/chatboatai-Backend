package com.bank.chatboat.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	
	@Id
	private int id;
	
	@Column
	private int accountId;
	
	@Column
	
	private double amount;
	
	@Enumerated(EnumType.STRING)
	private TransactionType type;

	
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transaction(int id, int accountId, double amount, TransactionType type) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.amount = amount;
		this.type = type;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public TransactionType getType() {
		return type;
	}


	public void setType(TransactionType type) {
		this.type = type;
	}
	
	
	
	
}
