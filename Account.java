package lecture9;

//기존에 github 에 제출했던 Account, AccountTest가 완벽하지 못하다고 판단하여 새롭게 리뉴얼 하였고 이에 맞추어 
//CheckingAccount를 작성하였음.

public class Account 
{
	private double balance;
	
	
	public Account()
	{
		balance = 0.00;
	}
	
	public void credit( double creditbalance)
	{
		balance = balance + creditbalance;
	}
	
	
	public void debit( double debitbalance )
	{
		if( balance - debitbalance >= 0)
		{	
			balance = balance - debitbalance;
		}	
		else
		{
			System.out.print("Debit amount exceeded account balance.\n");
		}
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