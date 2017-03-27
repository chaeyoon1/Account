package lecture9;

public class CheckingAccount extends Account
{
   private double creditLimit;
   private double interest;
   private double loan_interest;
                     
   public CheckingAccount (double initialBalance,double creditLimit,double interest, double loan_interest)
   {
	  super(initialBalance);
	  this.creditLimit = creditLimit;
      this.interest = interest;
      this.loan_interest = loan_interest;
      withdrawableAccount = balance + creditLimit;
   }
   //abstract override
   @Override
   public double getWithdrawableAccount()
   {
	   return withdrawableAccount;
   }
   
   @Override
   public void passTime(int month)
   {
	   if(balance>=0.00)
	   {
		   balance = Math.pow((balance *(1+interest)),month);
	   }
	   else
	   {
		   balance = Math.pow((balance *(1+loan_interest)),month);
	   }
   }
   //specific
   public boolean isBankrupted = balance <creditLimit;
   {
	   if (isBankrupted)
	   {
		   System.out.println("went Bankrupt!");
	   }
	   
   }
   @Override
   public void debit ( double debitbalance)
   {
	   balance-=debitbalance;
   }
   
   public void nextMonth()
   {
      if(balance>=0)
         balance*=(1+interest);
      
      else 
         balance*=(1+loan_interest);
      
   }
}
