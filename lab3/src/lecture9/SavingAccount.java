package lecture9;

public class SavingAccount extends Account
{
	private double passtimeInterest;
	private int monthtime=0;
	
	public SavingAccount (double initialBalance,double passtimeInterest)
	{
		super(initialBalance);
		this.passtimeInterest = passtimeInterest;
	}
	
	public double getWithdrawableAccount()
	{
		if(monthtime >= 12){
			return balance;
		}else{
			return 0;
		}
	}
	
	
	public void passTime(int time)
	{
		if(time >= 12 || monthtime >=12) 
		{
			balance = balance *Math.pow((1+passtimeInterest),12);
			monthtime = 12;
		}
		else 
		{	
			monthtime = monthtime + time;
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
		return balance*Math.pow((1+passtimeInterest),month);
	}
	
	public double estimateValue()
	{
		
		return balance = balance*Math.pow((1+passtimeInterest),1);
	}
}