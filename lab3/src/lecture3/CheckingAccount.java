package lecture3;

public class CheckingAccount extends Account
{
	private double credit_limit;
	private double interest;
	private double loan_interest;
							
	public CheckingAccount (double interest, double loan_interest)
	{
		credit_limit = balance;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	
	public void debit ( double debitbalance)
	{
		if( debitbalance >= credit_limit)
		{	
			balance = balance - debitbalance;
		}	
		else
		{
			balance = balance - debitbalance;
			System.out.print("Debit amount exceeded account balance.\n");
		}
	}
	
	public void nextMonth()
	{
		if(balance>=0)
			balance = balance*(1+interest);
		
		else 
			balance = balance*(1+loan_interest);
		
	}
}
