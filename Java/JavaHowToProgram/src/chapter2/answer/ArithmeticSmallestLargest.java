package chapter2.answer;

import java.util.Scanner;

public class ArithmeticSmallestLargest {

	public static void main(String[] args) {
		int sum, product;
		int avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num3 = sc.nextInt();
		
		System.out.format("The input numbers are: %d, %d and %d%n", num1, num2, num3);
		
		sc.close();
		

		sum = num1 + num2 + num3;
		product = num1 * num2 + num3;
		avg = sum / 3;
		
		System.out.println("The addition is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The average is " + avg);
		
		int largest;
		int smallest;
		
		 largest = num1;
		smallest = num1;
		
		//largest
		System.out.println();
		if (num2 > num1) {
			largest = num2;
		}
		
		if (num3 > num1) {
			largest = num3;
		}
		
		//smallest
		if (num2 < num1) {
			smallest = num2;
		}
		
		if (num3 < num2) {
			smallest = num3;
		}
		System.out.printf("%d is the Largest and %d is the smallest", largest, smallest);
	}

}
