# Digital Wallet Transaction System

A **Spring Boot MVC web application** that simulates a digital wallet transaction system.  
The application allows users to perform **credit and debit transactions**, automatically calculate wallet balance, and view transaction history in a modern dashboard UI.

This project demonstrates the use of **Object-Oriented Analysis and Design principles**, along with **Spring Boot MVC architecture**.

---

# Features

• Add new wallet transactions  
• Support for **Credit and Debit operations**  
• Prevent **negative transaction amounts**  
• Prevent **debit transactions exceeding wallet balance**  
• Automatically calculate **running wallet balance**  
• Display **transaction history table**  
• Auto-generate **transaction timestamps**  
• Responsive **modern dashboard UI**

---

# Technologies Used

| Technology | Purpose |
|------|------|
Java | Backend programming |
Spring Boot | Application framework |
Spring MVC | Web architecture |
Hibernate / JPA | ORM and database operations |
Thymeleaf | Server-side HTML rendering |
H2 Database | In-memory relational database |
HTML + CSS | Frontend interface |

---

# Project Architecture

The project follows the **MVC (Model–View–Controller)** design pattern.

Controller  
↓  
Service  
↓  
Repository  
↓  
Database  
↑  
View (Thymeleaf Templates)

### Components

**Model**
- `Transaction.java`
- Represents wallet transaction entity

**Repository**
- `TransactionRepository.java`
- Handles database operations using JPA

**Service**
- `TransactionService.java`
- Contains business logic such as balance calculation and validation

**Controller**
- `TransactionController.java`
- Handles user requests and responses

**View**
- `index.html`
- Displays the UI using Thymeleaf templates

---

# Application Screens

### Dashboard
Users can view all wallet transactions in a clean table format.

### Transaction Form
Users can add new transactions with:

- User Name
- Wallet ID
- Transaction Type (Credit/Debit)
- Amount
- Description

### Balance Calculation
The system calculates and displays a **running balance for each transaction**.

---

# Example Transaction Flow

| ID | Type | Amount | Balance |
|----|------|------|------|
|1|Credit|10000|10000|
|2|Credit|5000|15000|
|3|Debit|7000|8000|

---

# Functional Requirements Implemented

✔ Transaction can be added  
✔ Transaction list can be viewed  
✔ Negative amount not allowed  
✔ Debit cannot exceed wallet balance  
✔ Transaction time auto-generated  
✔ MVC architecture followed  

---

# Installation & Running the Project

### 1 Clone Repository

git clone https://github.com/rockraj21/digital-wallet-transaction-system.git

### 2 Navigate to Project Folder

cd digital-wallet-transaction-system

### 3 Run Application

./mvnw spring-boot:run

### 4 Open in Browser

http://localhost:8080

---

# Project Structure

walletlog  
│  
├── src  
│   └── main  
│       ├── java/com/wallet/walletlog  
│       │     ├── controller  
│       │     │      TransactionController.java  
│       │     ├── service  
│       │     │      TransactionService.java  
│       │     ├── repository  
│       │     │      TransactionRepository.java  
│       │     └── model  
│       │            Transaction.java  
│  
│       └── resources  
│             ├── templates  
│             │      index.html  
│             └── application.properties  
│  
├── pom.xml  
└── README.md  

---

# Future Improvements

Possible enhancements for the system:

• Multi-user wallet management  
• Authentication and login system  
• Graphs for transaction analytics  
• Persistent database (MySQL/PostgreSQL)  
• REST API support  
• Mobile-responsive UI

---

# Author

**Yuvraj Rao**  

GitHub:  
https://github.com/rockraj21

---

# License

This project is developed for **educational purposes as part of an OOAD lab assignment**.
