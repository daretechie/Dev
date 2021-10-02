package chapter4.Answer.Factorial;
import java.util.Scanner;

public class ConstantE 
{
	public static void main(String[] args) 
	{
		ConstantE obj = new ConstantE();
			
		obj.calFactorial();
	}
	
	public void calFactorial() 
	{
		int num;
		int facValue = 1;
		
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter the number of terms to calculate constant e: ");
		num = input.nextInt();
			
		while(num < 1)
		{
			System.out.println("\nOops input is less than one.");
					
			System.out.print("Enter the number of terms to calculate constant e: ");
			num = input.nextInt();
		}
		double e = 1.0;
		if(num >= 1)
		{
			for(int i = 1; i <= num; i++)
			{
				
				facValue *= i; 
				e += 1.0 / facValue;
			}
		
			System.out.printf("\nThe term is %d\n%s = %.2f", num, "e", e);
		}
		
		input.close();
	}
}
