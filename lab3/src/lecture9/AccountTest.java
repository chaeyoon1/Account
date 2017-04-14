package lecture9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest 
{
	public static void main(String args[]) throws Exception
	{
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		Scanner input = new Scanner(System.in);
		
		try
		{
			double debitBalance;
			System.out.println("Enter deposit amount for Account1: ");
			debitBalance = input.nextDouble();
			account1.debit(debitBalance);
			System.out.println("Account1 balance: $" +account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			debitBalance = input.nextDouble();
			account2.debit(debitBalance);
			System.out.println("Account2 balance: $" +account2.getBalance());
		}
		catch(InputMismatchException inputMismatchexception)
		{
			System.out.println("예외발생 : 숫자를 입력하세요\n" + inputMismatchexception.toString());
		}
		//미완
		catch(Exception exception)
		{
			System.out.println("예외발생  " + exception.toString());
		}
		//
		finally
		{
			account1.passTime(2);
			System.out.println("2 month later account1 : " +account1.getBalance());
		}
	}
}
