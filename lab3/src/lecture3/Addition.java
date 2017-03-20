package lecture3;

import java.util.Scanner;

public class Addition 
{
	public static void main(String argsp[])
	{
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("첫번째 숫자는?");
		a = input.nextInt();
		
		System.out.print("두번째 숫자는?");
		b = input.nextInt();
		
		c = a + b;
		
		System.out.printf("\nsum is %d",c);
	}
}
