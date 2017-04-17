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
	
	public double getWithdrawableAccount()
	{
		 
		return balance;
	}
	
	
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
	
	public void passTime()
	{
		if(monthtime >= 12) 
		{
			balance = balance *Math.pow((1+passtimeInterest),12);
			monthtime = 12;
		}
		else 
		{	
			monthtime = monthtime + 1;
			balance = balance;
		}
	}
	
	
	public void debit( double debitBalance ) throws Exception
	{
		if(monthtime >=12)
		{	
			balance = balance - debitBalance;
		}
		else
		{	
			throw new Exception("아직 출금할 수 없습니다.");
		}
	}	
	
	
	//implement method
	public double estimateValue(int month)
	{
		balance = balance*Math.pow((1+passtimeInterest),month);
		return balance;
	}
	
	public double estimateValue()
	{
		
		balance = balance*Math.pow((1+passtimeInterest),1);
		return balance;
	}
}