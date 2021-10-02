package chapter4.Answer.TwoLargestNumber;

import java.util.Scanner;

public class TwoLargestNumber {
		
		public static void main(String[] args) {
			TwoLargestNumber largestNumber = new TwoLargestNumber();
			largestNumber.isLargeNumber();
			
		}
		
		//@SuppressWarnings("resource")
		public void isLargeNumber() {
			
			int number;
			int counter;
			int largest = 0;
			int largest1 = 0;
			
			System.out.println("\t\tFIND THE TWO LARGEST NUMBERS");
			System.out.println("Enter ten series of integer to determine the two largest number.\n");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			for(counter = 1; counter <= 10; counter++)
			{
				System.out.printf("Number %d: ", counter);
				number = input.nextInt();
				
				if (number > largest) {
					largest = number;
					//largest1 = largest;
					if(number > largest) {
						largest1 = number;	
				}
				
				System.out.printf("Largest Numbers so far are %d and %d", largest, largest1);
				System.out.println("\n");
			}
			
			}
			System.out.println("\nOverall largest number are "+ largest + " and " + largest1);

	}

}
