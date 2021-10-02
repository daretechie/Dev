package chapter5.Answer.BarChartPrinting;

import java.util.Scanner;

public class BarChartPrinting {
	
	public void printingBar() 
	{
		System.out.println("\t\tBar chart printing program".toUpperCase());
		int value = 0, inputnumber, number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
		
		Scanner input = new Scanner(System.in);
		
		int i =1;
		while(i <= 5)
		{
			System.out.print("Enter digits between 1-30: ");
			inputnumber = input.nextInt();
			
			if(inputnumber >= 1 && inputnumber <= 30) 
			{
				switch(i)
				{
				case 1:
					number1 = inputnumber;
					break;
					
				case 2:
					number2 = inputnumber;
					break;
					
				case 3:
					number3 = inputnumber;
					break;
					
				case 4:
					number4 = inputnumber;
					break;
					
				case 5:
					number5 = inputnumber;
					break;
				}
				i++;
				
			}
			else 
			{
				System.out.println("Oops! only 1 - 30 integer");
			}
			
		}
		input.close();
		System.out.println("\nThe Bar Chart");
		for(int c = 1; c <= 5; c++)
		{
			switch(c)
			{
			case 1:
				value = number1;
				break;
				
			case 2:
				value = number2;
				break;
				
			case 3:
				value = number3;
				break;
				
			case 4:
				value = number4;
				break;
				
			case 5:
				value = number5;
				break;
				
			}	
		
				for(int j = 1; j <= value; j++) 
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
			
		}
	
	public static void main(String[] args) 
	{
		BarChartPrinting obj = new BarChartPrinting();
		obj.printingBar();
	}
}
