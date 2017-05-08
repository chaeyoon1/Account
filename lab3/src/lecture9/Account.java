package lecture9;

import java.util.ArrayList;

public abstract class Account implements Valuable
{
	protected double balance;
	
	
	public Account(double initialBalance)
	{
		balance = initialBalance;
	}
	//abstract
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	public abstract void passTime();	
	
	//credit,debt
	public void credit ( double creditbalance)
	{
		balance = balance + creditbalance;
	}
	
	
	public void debit( double debitBalance ) throws Exception
	{
		balance -= debitBalance;
	}	
	
	//set, get
	public double getBalance()
	{
		return balance;
	}
	
	protected void setBalance (double balance)
	{ 
		this.balance = balance;
	}
	
	//sumFor, passTimeForList
	public static double sumForAccount(ArrayList<? extends Account> list)
	{
		double sum = 0;
		for(Account account : list)
		{
			sum+= account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<? extends Account> list, int month)
	{
		for(Account account : list)
		{
			account.passTime(month);
		}
	}

}