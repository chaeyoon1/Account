package lecture9;

import java.util.Scanner;

public class ValuableTest 
{
	public static void main(String args[])
	{
		Valuable[] objectList = new Valuable[4];
		objectList[0] = new CheckingAccount(100,50,0.01,0.07);
		objectList[1] = new SavingAccount(100,0.05);
		objectList[2] = new Human("Mark",20);
		objectList[3] = new Car("My Car",5000);
		
		Scanner input = new Scanner(System.in);
		
		
		//check
		System.out.printf("CheckingAccount_Balance : %.2f \n",objectList[0].estimateValue(0));
		System.out.printf("6 month later Valuable : %.2f \n",objectList[0].estimateValue(6));
		System.out.println();
		//saving
		System.out.printf("SavingAccount_Balance : %.2f \n",objectList[1].estimateValue(0));
		System.out.printf("6 month later Valuable : %.2f \n",objectList[1].estimateValue(6));
		System.out.println();
		//Human
		System.out.printf("Human name : %s \n",objectList[2].toString());
		System.out.printf("registered age : %.2f \n",((Human)objectList[2]).getAge());
		System.out.printf("6 month later Valuable : %.2f \n",objectList[2].estimateValue(6));
		System.out.println();
		//Car
		System.out.printf("Car name : %s \n",objectList[3].toString());
		System.out.printf("initial Price : %.2f \n",objectList[3].estimateValue(0));
		System.out.printf("6 month later Valuable : %.2f \n",objectList[3].estimateValue(6));
	}
}
