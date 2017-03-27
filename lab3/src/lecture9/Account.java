package lecture9;

public abstract class Account 
{
	protected double balance;
	protected double withdrawableAccount;
	
	public Account(double initialBalance)
	{
		balance = initialBalance;
	}
	//abstract
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
		
	//credit,debit
	public void credit ( double creditbalance)
	{
		balance = balance + creditbalance;
	}
	
	
	public void debit( double debitbalance )
	{
		balance = balance - debitbalance;
	}	
	
	//set, get
	public double getbalance()
	{
		return balance;
	}
	
	protected void setBalance (double balance)
	{ 
		this.balance = balance;
	}
}