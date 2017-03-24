package lecture9;

import java.util.Scanner; 

public class AccountTest 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		CheckingAccount account1 = new CheckingAccount(0.01,0.07);
		CheckingAccount account2 = new CheckingAccount(0.01,0.07);
		
		account1.credit(100.00);
		account2.credit(100.00);
		System.out.printf("account1 balance: $%.2f\n",account1.getbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getbalance());
		
		double creditbalance;
		System.out.print("Enter deposit amount for account1:");
		creditbalance = input.nextDouble();
		account1.credit(creditbalance);
		System.out.println();
		
		System.out.printf("account1 balance: $%.2f\n",account1.getbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getbalance());
		
		double debitbalance;
		System.out.print("Enter withdrawal amount for account2:");
		debitbalance = input.nextDouble();
		account2.debit(debitbalance);
		System.out.println();
		
		System.out.printf("account1 balance: $%.2f\n",account1.getbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getbalance());
		System.out.println();
		
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("account1 balance: $%.2f\n",account1.getbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getbalance());
		
	}
}