package lecture9;

//기존에 github 에 제출했던 Account, AccountTest가 완벽하지 못하다고 판단하여 새롭게 리뉴얼 하였고 이에 맞추어 
//CheckingAccount를 작성하였음.

public class Account 
{
	protected double balance;
	//balance를 protected로 선언해야 CheckingAccount에서도 사용이 가능한데...
	//private로 선언하는 경우에도 방법이 있는건지..
	
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