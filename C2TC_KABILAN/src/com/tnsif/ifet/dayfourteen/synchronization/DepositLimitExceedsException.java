package com.tnsif.ifet.dayfourteen.synchronization;

public class DepositLimitExceedsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DepositLimitExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
