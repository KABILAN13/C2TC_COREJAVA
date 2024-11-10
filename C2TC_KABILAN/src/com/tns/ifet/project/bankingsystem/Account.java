package com.tns.ifet.project.bankingsystem;

public abstract class Account {
	protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        Bank.incrementTotalAccounts(); // Increment total accounts when a new account is created
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + getBalance());
    }


}
