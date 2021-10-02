package chapter2.answer;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		
		System.out.format("The input numbers are: %d and %d", num1, num2);
		
		sc.close();
		System.out.println();
		if (num1 > num2) {
			System.out.println(num1 + " is Larger");
		}
		
		if (num1 < num2) {
			System.out.println(num2 + " is Larger");
		}
		
		if (num1 == num2) {
			System.out.println("These numbers are equal");
		}
	}
}
