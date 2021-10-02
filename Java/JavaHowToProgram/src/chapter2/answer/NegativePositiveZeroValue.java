package chapter2.answer;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class NegativePositiveZeroValue {

	public static void main(String[] args) {
		
		int ptv, neg, zero; // positive, negative zero resp.

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
		
		ptv = 0;
		neg = 0;
		zero = 0;
		
		//for positive
		
		if (num1 > 0) {
			ptv = num1;	
			System.out.printf("%nPositive number: %d%n", ptv);
		}
		if (num1 < 0) {
			neg = num1;
			System.out.printf("Negative number: %d%n", neg);
			
		}
		if (num1 == 0) {
			zero = num1;
			System.out.printf("Zero number: %d%n", zero);
		}
		
		
		
		
		if (num2 == 0) {
			zero = num2;	
			System.out.printf("Zero number: %d%n", zero);
		}
		if (num2 < 0) {
			neg = num2;	
			System.out.printf("Negative number: %d%n", neg);
		}
		if (num2 > 0) {
			ptv = num2;	
			System.out.printf("Positive number: %d%n", ptv);
		}
		
		
		if (num3 > 0) {
			ptv = num3;
			System.out.printf("Positive number: %d%n", ptv);
		}
		if (num3 < 0) {
			neg = num3;
			System.out.printf("Negative number: %d%n", neg);
		}
		if (num3 == 0) {
			zero = num3;	
			System.out.printf("Zero number: %d%n", zero);
		}
				
		
		if (num4 < 0) {
			neg = num4;	
			System.out.printf("Positive number: %d%n", neg);
		}
		if (num4 > 0) {
			ptv = num4;	
			System.out.printf("Negative number: %d%n", ptv);
		}
		if (num4 == 0) {
			zero = num4;
			System.out.printf("Zero number: %d%n", zero);
		}
				
		
		if (num5 > 0) {
			ptv = num5;	
			System.out.printf("Positive number: %d%n", ptv);
		}
		
		if (num5 < 0) {
			neg = num5;
			System.out.printf("Negative number: %d%n", neg);
		}
		if (num5 == 0) {
			zero = num5;
			System.out.printf("Zero number: %d%n", zero);
		}		

	}
}
