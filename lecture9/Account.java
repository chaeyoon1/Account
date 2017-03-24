package lecture9;

//������ github �� �����ߴ� Account, AccountTest�� �Ϻ����� ���ϴٰ� �Ǵ��Ͽ� ���Ӱ� ������ �Ͽ��� �̿� ���߾� 
//CheckingAccount�� �ۼ��Ͽ���.

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