package lecture3;

public class Account 
{
	private double balance;
	
	public Account(double balance)
	{
		if(balance > 0.00) this.balance = balance;
		
	}
	
	public void credit( double addingmoney)
	{
		balance = balance + addingmoney;
	}
	
	public void debit( double minusmoney)
	{
		if(balance - minusmoney >= 0.00) 
			{
			balance = balance - minusmoney;
			}
		else
		{
			System.out.print("Debit amount exceeded account balance\n");
			balance = balance - 0.00;
		}
	}
	
	public double returnbalance()
	{
		return balance;
	}

}