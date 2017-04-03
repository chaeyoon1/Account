package lecture9;

public class SavingAccount extends Account
{
	private double passtimeInterest;
	private int monthtime;
	
	public SavingAccount (double initialBalance,double passtimeInterest)
	{
		super(initialBalance);
		this.passtimeInterest = passtimeInterest;
		monthtime = 0;
		
	}
	@Override
	public double getWithdrawableAccount()
	{
		 
		return balance;
	}
	
	@Override
	public void passTime(int month)
	{
		if(monthtime >= 12) 
		{
			balance = balance *Math.pow((1+passtimeInterest),12);
			monthtime = 12;
		}
		else 
		{	
			monthtime = monthtime + month;
			balance = balance;
		}
	}
	
	@Override
	public void debit( double debitbalance )
	{
		if(monthtime >=12)
			balance = balance - debitbalance;
		else
			balance = balance;
	}	
	
	public void isBankrupted()
	{
		
	}
	//implement method
	public double estimateValue(int month)
	{
		balance = balance *Math.pow((1+passtimeInterest), month);
		return balance;
	}
}
