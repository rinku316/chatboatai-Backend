# AI Powered Banking Chatbot

An AI-powered banking chatbot built using Spring Boot, React, and MySQL.
The chatbot supports banking-related conversations such as balance inquiry, transaction history, and voice-enabled chatbot interaction.

---

# Features

* AI Chatbot Conversation
* Balance Inquiry
* Transaction History
* Voice Input Support
* Voice Output Support
* Stateful Chat Flow
* REST API Integration
* React Frontend
* Spring Boot Backend
* MySQL Database Integration

---

# Tech Stack

## Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven

## Frontend

* React JS
* CSS

## Database

* MySQL

## Tools

* Postman
* GitHub
* VS Code
* STS / IntelliJ

---

# Project Architecture

src/main/java

├── controller
├── service
├── repository
├── entity
├── config
└── dto

---

# API Endpoints

## Chatbot API

POST /api/chat

## Balance API

GET /api/balance/{id}

## Transaction History API

GET /api/transactions/{id}

---

# Chatbot Conversation Examples

## Greeting

User:
hi

Bot:
Hello! How can I help you today?

---

## Balance Inquiry

User:
check balance

Bot:
Please enter your account number

User:
1

Bot:
Your balance is ₹25000

---

## Transaction History

User:
show transactions

Bot:
Please enter account number

User:
1

Bot:
CREDIT ₹2000
DEBIT ₹500
CREDIT ₹1000

---

# Voice Features

* Speech-to-Text using Browser Speech Recognition
* Text-to-Speech AI Voice Response
* Female AI Voice Support

---

# Database Tables

* customers
* accounts
* transactions

---

# How To Run The Project

## Backend

1. Clone repository

2. Configure MySQL database in application.properties

3. Run Spring Boot application

4. Backend runs on:

http://localhost:9090

---

## Frontend

1. Open frontend folder

2. Install dependencies

npm install

3. Run React application

npm start

4. Frontend runs on:

http://localhost:3000

---

# Future Enhancements

* Fund Transfer Module
* JWT Authentication
* OpenAI Integration
* Card Blocking Feature
* Loan Eligibility System
* Email Notifications
* Cloud Deployment

---

# Screenshots

Add screenshots here:

* Chat UI
* Postman APIs
* Database Tables
* Voice Assistant

---

# Author

Tulachand Meher

---

# GitHub Repository

Add your repository link here.
