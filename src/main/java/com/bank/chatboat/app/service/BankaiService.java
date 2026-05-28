package com.bank.chatboat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.chatboat.app.repository.BankaiReposiroey;

@Service
public class BankaiService {
	
	@Autowired
	BankaiReposiroey bio;
	
	public double getBalance(int id) {
		return bio.findById(id)
				.orElseThrow(() -> new RuntimeException("Account not found"))
				.getBalance();
	}
}
