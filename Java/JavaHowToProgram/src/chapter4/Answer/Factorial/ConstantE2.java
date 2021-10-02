package chapter4.Answer.Factorial;

import java.util.Scanner;

public class ConstantE2 {
	
	public static void main(String[] args) 
	{
		ConstantE2 obj = new ConstantE2();
			
		obj.getConstant2();
	}
	
	public void getConstant2() 
	{
		int num;
		int facValue = 1;
		
		Scanner input = new Scanner(System.in);
			
		  System.out.print("Enter the number of times to calculate e^x: ");
	      num = input.nextInt();

	        System.out.print("Enter x: ");
	        int x = input.nextInt();
			
		while(num < 1)
		{
			System.out.println("\nOops input is less than one.");
					
			System.out.print("Enter the number of times to calculate e^x: ");
			num = input.nextInt();
		}
		double e = 1.0;
		if(num >= 1)
		{
			for(int i = 1; i <= num; i++)
			{
				
				facValue *= i; 
				e += x / facValue;
				x = (int) Math.pow(x, i);
			}
		
			//System.out.printf("\nThe term is %d\n%s = %.2f", num, "e", e);
			System.out.printf("e^x = %.2f\n", e);

		}
		
		input.close();
	}

}
