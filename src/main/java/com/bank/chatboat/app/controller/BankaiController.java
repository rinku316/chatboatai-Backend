package com.bank.chatboat.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.chatboat.app.entity.Transaction;
import com.bank.chatboat.app.service.BankaiService;


@RestController
@RequestMapping("/api")
public class BankaiController {

    @Autowired
    BankaiService bis;

    private Map<String, String> userState = new HashMap<>();

    
    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> req) {

        String message = req.get("message").toLowerCase();
        String user = req.get("user");   

        if (message.contains("hi") || message.contains("hello") || message.contains("hy")) {
            return Map.of("reply", "Hello! How can I help you today?");
        }

        
        
        // Step 1: Ask for account number
        if (message.contains("balance")) {
            userState.put(user, "WAITING_ACCOUNT");
            return Map.of("reply", "Please enter your account number:");
        }

        
        
        // Step 2: Process account number
        if (userState.get(user) != null && userState.get(user).equals("WAITING_ACCOUNT")) {

            if (!message.matches("\\d+")) {   
                return Map.of("reply", "Please enter a valid account number ❌");
            }

            try {
                int accId = Integer.parseInt(message);
                double bal = bis.getBalance(accId);

                userState.remove(user);

                return Map.of("reply", "Your balance is ₹" + (int) bal);

            } catch (Exception e) {
                return Map.of("reply", "Account not found ❌");
            }
        }

        return Map.of("reply", "I didn't understand. Try asking 'check balance'");
    }
    
    
    
    @GetMapping("/balance/{id}")
    public double getBalance(@PathVariable int id) {
        return bis.getBalance(id);
    }
    
    
    @GetMapping("/transactions/{id}")
    public List<Transaction> getTransactions(@PathVariable int id) {
    	return bis.getTransaction(id);
    }
    
    
    
    

}