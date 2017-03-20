package lecture3;

public class CheckingAccount extends Account 
{
	
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount ( double balance,double credit_limitBalance, double interestRate, double loan_interestRate)
	{
		super(balance);
		this.balance = balance;
		credit_limit = credit_limitBalance;
		interest = interestRate;
		loan_interest = loan_interestRate;
	}
	
	@Override
	public void debit( double minusmoney)
	{
		balance = balance - minusmoney;
		
	}
	
	public void nextMonth()
	{
		interest = 0.01;
		loan_interest = 0.07;
		if( balance >=0)
			balance = balance + (balance * interest);
		else
			balance = balance + (balance * loan_interest);
	}
}
