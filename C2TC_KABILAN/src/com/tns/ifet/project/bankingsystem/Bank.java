package com.tns.ifet.project.bankingsystem;

public class Bank {
	private static int totalAccounts = 0;

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to increment total accounts
    public static void incrementTotalAccounts() {
        totalAccounts++;
}


}
