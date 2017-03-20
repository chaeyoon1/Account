package lecture3;

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account(100.00);
		Account account2 = new Account(100.00);
		
		System.out.println(" // .. add money to the account");
		System.out.println(" // .. check the balance of the account");
		System.out.println("...");
		System.out.printf("account1 balance: $%.2f\n",account1.returnbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.returnbalance());
		System.out.println();
		
		double debitmoney;
		double addingmoney;
		System.out.printf("Enter deposit amount for account1:");
		addingmoney = input.nextDouble();
		System.out.println();
		System.out.printf("substracting %.2f from account1 balance\n",addingmoney);
		account1.debit(addingmoney);
		System.out.printf("account1 balance: $%.2f\n",account1.returnbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.returnbalance());
		System.out.println();
		
		System.out.printf("Enter withdrawal amount for account2:");
		debitmoney = input.nextDouble();
		System.out.println();
		System.out.printf("substracting %.2f from account2 balance\n",debitmoney);
		account2.debit(debitmoney);
		
		System.out.printf("account1 balance: $%.2f\n",account1.returnbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.returnbalance());
		System.out.println();
		
		System.out.printf("next month!");
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("account1 balance: $%.2f\n",account1.returnbalance());
		System.out.printf("account2 balance: $%.2f\n",account2.returnbalance());
		
		
	}
}