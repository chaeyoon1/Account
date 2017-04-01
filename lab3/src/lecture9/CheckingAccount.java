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
      
   }
   //abstract override
   @Override
   public double getWithdrawableAccount()
   {
	   withdrawableAccount = balance + creditLimit;
	   if(withdrawableAccount <0)
	   {
		   withdrawableAccount=0;
	   }
	   return withdrawableAccount;
	   
   }
   
   @Override
   public void passTime(int month)
   {
	   if(balance>=0.00)
	   {
		   balance = balance *Math.pow((1+interest),month);
	   }
	   else
	   {
		   balance = balance *Math.pow((1+loan_interest),month);
		   if(balance+creditLimit <0)
		   {
			   withdrawableAccount =0;
		   }
	   }
   }
   
   @Override
   public void isBankrupted()
   {
	   if (withdrawableAccount ==0)
	   {
		   System.out.println("account1 went Bankrupt!");
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
