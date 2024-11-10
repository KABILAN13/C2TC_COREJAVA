package com.tns.ifet.project.bankingsystem;

public class SavingsAccount extends  Account {
	private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Savings Account");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    @Override
    public double getBalance() {
        return balance + (balance * INTEREST_RATE);
}


}
