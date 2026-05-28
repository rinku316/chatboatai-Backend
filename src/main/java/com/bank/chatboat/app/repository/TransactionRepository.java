package com.bank.chatboat.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.chatboat.app.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	List<Transaction> findByAccountId(int accountId);
}
