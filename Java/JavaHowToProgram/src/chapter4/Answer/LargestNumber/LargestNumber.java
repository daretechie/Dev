package chapter4.Answer.LargestNumber;

import java.util.Scanner;

/**
 * collect first number and store to a variable
 * collect second number 
 * compare first and second to know the largest
 * save the largest
 * collect another integer and repeat the process
 * 
 */
public class LargestNumber {
	
	public static void main(String[] args) {
		LargestNumber largestNumber = new LargestNumber();
		largestNumber.isLargeNumber();
		
	}
	
	//@SuppressWarnings("resource")
	public void isLargeNumber() {
		
		int number;
		int counter;
		int largest = 0;
		
		System.out.println("\t\tFIND THE LARGEST NUMBER");
		System.out.println("Enter ten series of integer to determine the largest.\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(counter = 1; counter <= 10; counter++)
		{
			System.out.printf("Number %d: ", counter);
			number = input.nextInt();
			
			if (number > largest) {
				largest = number;
				
			}
			
			System.out.printf("Largest Number so far is %d", largest);
			System.out.println("\n");
		}
		
		System.out.println("\nOverall largest number is "+ largest);
	}
}
