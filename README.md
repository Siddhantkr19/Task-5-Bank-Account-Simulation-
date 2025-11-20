# 🏦 Bank Account Simulation System

A console-based banking application built in Java. This project simulates basic banking operations, allowing users to manage accounts and perform transactions through a simple command-line interface.

##  Features
* **Create Account:** Register a new user with a First Name, Last Name, and Account Type (Savings/Current).
* **Auto-Generated IDs:** Automatically generates a unique 12-digit Account Number for every new user.
* **Deposit Money:** Add funds to a specific account number.
* **Withdraw Money:** Withdraw funds with validation checks (ensures sufficient balance).
* **Check Balance:** View the current balance of a specific user.
* **Admin View:** View a list of all registered users and their details.

##  Technologies Used
* **Language:** Java (Core)
* **Data Structure:** `ArrayList` (to store user data in memory)
* **Input Handling:** `java.util.Scanner`
* **Utilities:** `java.util.UUID` (for generating random account numbers)

##  How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Siddhantkr19/your-repo-name.git](https://github.com/Siddhantkr19/your-repo-name.git)
    ```
2.  **Compile the code:**
    ```bash
    javac BankAccountSimulation.java
    ```
3.  **Run the application:**
    ```bash
    java BankAccountSimulation
    ```
