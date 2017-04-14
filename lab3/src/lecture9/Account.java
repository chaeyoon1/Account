package lecture9;

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
		
	public abstract void isBankrupted();
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
}