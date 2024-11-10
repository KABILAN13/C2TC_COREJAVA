package com.tns.ifet.project.bankingsystem;

public class Transaction {
	private final double transactionFee;

    public Transaction(double fee) {
        this.transactionFee = fee;
    }

    // Final method to perform a transaction
    public final void performTransaction(Account account, String type, double amount) {
        if (type.equals("deposit")) {
            account.deposit(amount - transactionFee);
            System.out.println("Transaction Fee of " + transactionFee + " applied on deposit.");
        } else if (type.equals("withdraw")) {
            account.withdraw(amount + transactionFee);
            System.out.println("Transaction Fee of " + transactionFee + " applied on withdrawal.");
        } else {
            System.out.println("Invalid transaction type.");
        }
        account.displayBalance();
}


}
