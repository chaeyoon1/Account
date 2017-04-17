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
	   
	   if(balance + creditLimit <0)
	   {
		   balance = -creditLimit;
	   }
	   return balance + creditLimit;
	   
   }
   
   
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
			   balance = -creditLimit;
		   }
	   }
   }
   
   public void passTime()
   {
	   balance = balance *Math.pow((1+interest),1);
   }
   
  
   public boolean isBankrupted()
   {
	   if (this.getWithdrawableAccount() < 0)
	   {
		   return true;
	   } else{
		   return false;
	   }
   }
   
   public void debit ( double debitBalance) throws Exception
   {
	   if(debitBalance >=0)
	   {
		   if(balance +creditLimit - debitBalance>=0)
				balance = balance - debitBalance;
		   else 
		   {
				throw new Exception("Debit amount exceeded account balance.");
		   }
	   }
	   else
	   {
		   throw new Exception("음수입력!");
	   }
   }
   
   public void nextMonth()
   {
	   if(balance>=0)
         balance*=(1+interest);
	   else 
         balance*=(1+loan_interest);
      
   }
   //implement method
   public double estimateValue(int month)
   {

	   if(balance>=0.00)
	   {
		   balance = balance*Math.pow((1+interest),month);
	   }
	   else
	   {
		   balance = balance*Math.pow((1+loan_interest),month);
	   }
	   return balance;
   }
   
   public double estimateValue()
   {
	   if(balance>=0.00)
	   {
		   balance = balance + (1+interest)*1;
	   }
	   else
	   {
		   balance = balance*Math.pow((1+loan_interest),1);
	   }
	   return balance;
   }
}  
