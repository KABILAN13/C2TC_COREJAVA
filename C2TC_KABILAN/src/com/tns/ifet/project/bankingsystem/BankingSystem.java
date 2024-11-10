package com.tns.ifet.project.bankingsystem;

public class BankingSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        // Displaying total accounts
        System.out.println("Total Accounts Created: " + Bank.getTotalAccounts());

        // Creating a transaction with a fee
        Transaction transaction = new Transaction(10); // transaction fee of 10

        // Performing transactions on savings account
        transaction.performTransaction(savings, "deposit", 200);
        transaction.performTransaction(savings, "withdraw", 150);

        // Performing transactions on checking account
        transaction.performTransaction(checking, "deposit", 300);
        transaction.performTransaction(checking, "withdraw", 200);

        // Display total accounts at the end
        System.out.println("Total Accounts Created: " + Bank.getTotalAccounts());

	}

}


