package lecture9;

import java.util.ArrayList;

public class AccountTest {
	public static void main(String args[]) throws Exception{
		CheckingAccount account1 = new CheckingAccount(100,50,0.01,0.07);
		SavingAccount account2 = new SavingAccount(100,0.05);
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		//accountList에 account1 과 account2를 추가하세요.
		accountList.add(account1);
		accountList.add(account2);
		
		System.out.println("전쳬 계좌의 잔액 합산 : " + Account.sumForAccount(accountList));
		
		System.out.println("전쳬 계좌의 12개월 후 적용");
		Account.passTimeForList(accountList,12);
		System.out.println("전쳬 계좌의 잔액 합산 : "+ Account.sumForAccount(accountList));
	}
}