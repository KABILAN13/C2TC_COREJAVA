package com.tnsif.ifet.dayfourteen.synchronization;

public class AccountThread extends Thread {
	private Account acc;
	private int amt;
	
	public AccountThread(Account acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		start();
		
	}
	public void AccountThread1(Account acc2, int amt2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run()
	{
		/* Using Synchronized Block - withdraw() is non synchronized
		 * synchronized (acc) 
		 * { 
		 * acc.withdraw(amt); 
		 * }
		 */		
		
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}
}
