package chapter5.Answer.SmallestValue;

import java.util.Scanner;

public class SmallestValue {
	
	public void isSmallest(int integer) {
		
		//int integer = 0;
	
		}
	
	public void input() 
	{

		int smallest = 0;
		int value;
		int numberOfInput;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total of integer you want to input: ");
		numberOfInput = input.nextInt();
		
		int count = 1;
		while(count <= numberOfInput) 
		{
			System.out.printf("Enter number %d: ", count);
			value = input.nextInt();
			
			
			if (count == 1) 
			{
				smallest = value;
			}
			else if(value < smallest)
				{
					smallest = value;
				}
			count++;
			System.out.println("The smallest is " + smallest+"\n");
			}
		System.out.println("\nThe overall smallest is " + smallest);
		input.close();
		}
	
	
	public static void main(String[] args) {
		SmallestValue obj = new SmallestValue();
		obj.input();
	}

}
