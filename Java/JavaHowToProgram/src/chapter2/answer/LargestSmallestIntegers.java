package chapter2.answer;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class LargestSmallestIntegers {

	public static void main(String[] args) {
		
		int largest, smallest;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num3 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num4 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num5 = sc.nextInt();
		
		sc.close();
		
		largest = num1;
		smallest = num1;
		
		if (num2 > num1) {
			largest = num2;
			//System.out.println(num2 + " is Largest");
		}
		
		if (num3 > num1) {
			largest = num3;
			//System.out.println(num3 + " is Larger");
		}
		
		if (num4 > num1) {
			largest = num4;
			//System.out.println(num4 + " is Larger");
		}
		
		if (num5 > num1) {
			largest = num5;
		}
		
		
		if (num2 < num1) {
			smallest = num2;
			//System.out.println(num2 + " is Largest");
		}
		
		if (num3 < num1) {
			smallest = num3;
			//System.out.println(num3 + " is Larger");
		}
		
		if (num4 < num1) {
			smallest = num4;
			//System.out.println(num4 + " is Larger");
		}
		
		if (num5 < num1) {
			smallest = num5;
		}
		System.out.printf("%d is the Largest and %d is the smallest", largest, smallest);

	}

}
