package lecture9;

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		System.out.printf("account1 balance: $%.2f \t현재출금가능액: %.2f\n",account1.getbalance(),account1.getWithdrawableAccount());
		
		double debitbalance;
		System.out.print("Enter withdrawal amount for account1:");
		debitbalance = input.nextDouble();
		account1.debit(debitbalance);
		System.out.printf("account1 balance: $%.2f \t현재출금가능액: %.2f\n",account1.getbalance(),account1.getWithdrawableAccount());
		//파산여부확인
		
		
		
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
