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
		withdrawableAccount=balance; 
	}
	@Override
	public double getWithdrawableAccount()
	{
		return withdrawableAccount;
	}
	
	@Override
	public void passTime(int month)
	{
		monthtime = month;
		if(month < 12)
		{
			balance = balance;
		}
		else
		{	
			balance = Math.pow((balance *(1+passtimeInterest)),month);
		}
	}
	
	@Override
	public void debit( double debitbalance )
	{
		if(monthtime >12)
			balance = balance - debitbalance;
		else
			balance = balance;
	}	
}
