package com.tns.ifet.project.bankingsystem;

public class CheckingAccount extends Account {
	private static final double OVERDRAFT_LIMIT = 500;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Checking Account");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + OVERDRAFT_LIMIT) >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account");
        } else {
            System.out.println("Overdraft limit exceeded in Checking Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
}


}
