package lecture9;

public class CheckingAccount extends Account
{
   private double credit_limit;
   private double interest;
   private double loan_interest;
                     
   public CheckingAccount (double interest, double loan_interest)
   {
      credit_limit = getbalance();
      this.interest = interest;
      this.loan_interest = loan_interest;
   }
   
   
   public void debit ( double debitbalance)
   {
      if( credit_limit - debitbalance >= 0.00)
      {   
         setBalance(getbalance() - debitbalance);
      }   
      else
      {
    	  System.out.print("\nDebit amount exceeded account balance.");
    	  setBalance(getbalance() - debitbalance);
      }
   }
   
   public void nextMonth()
   {
      if(getbalance()>=0)
         setBalance(getbalance()*(1+interest));
      
      else 
         setBalance((getbalance()*(1+loan_interest)));
      
   }
}
