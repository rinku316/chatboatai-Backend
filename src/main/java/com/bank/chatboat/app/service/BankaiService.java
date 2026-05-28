package com.bank.chatboat.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.chatboat.app.entity.Transaction;
import com.bank.chatboat.app.repository.BankaiReposiroey;
import com.bank.chatboat.app.repository.TransactionRepository;

@Service
public class BankaiService {
	
	@Autowired
	BankaiReposiroey bio;
	
	@Autowired
	TransactionRepository tr;
	
	public double getBalance(int id) {
		return bio.findById(id)
				.orElseThrow(() -> new RuntimeException("Account not found"))
				.getBalance();
	}
	
	
	
	// transaction history logic
	public List<Transaction> getTransaction(int accountId) {
		return tr.findByAccountId(accountId);
	}
}
