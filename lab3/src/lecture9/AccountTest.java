package lecture9;

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		//CheckingAccount
		System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f\n",account1.getbalance(),account1.getWithdrawableAccount());
		
		double debitbalance;
		System.out.print("Enter withdrawal amount for account1:");
		debitbalance = input.nextDouble();
		account1.debit(debitbalance);
		System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f\n",account1.getbalance(),account1.getWithdrawableAccount());
		//파산여부확인
		
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f\n",account1.getbalance(),account1.getWithdrawableAccount());
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $%.2f \t현재출금가능액: %.2f\n",account1.getbalance(),account1.getWithdrawableAccount());
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getbalance(),account2.getWithdrawableAccount());
		
		System.out.printf("6 Month later!\n");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getbalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getbalance(),account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getbalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getbalance(),account2.getWithdrawableAccount());
	}
}