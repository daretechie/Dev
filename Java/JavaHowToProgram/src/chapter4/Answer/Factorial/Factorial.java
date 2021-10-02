package chapter4.Answer.Factorial;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Factorial obj = new Factorial();
		
		obj.calFactorial();
	}
	
	
	public void calFactorial() 
	{
		int num;
		int facValue = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter nonnegative integer: ");
		num = input.nextInt();
		
		while(num < 1)
		{
			System.out.println("\nOops input is less than one.");
				
			System.out.print("Enter nonnegative integer: ");
			num = input.nextInt();
		}
		
		if(num >= 1)
		{
			
			for(int i = 1; i <= num; i++)
			{
				facValue *= i; 
			}
		System.out.printf("\n%d! = %d", num, facValue);
		}
		input.close();
	}
}
