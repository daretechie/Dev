package chapter2.answer;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */
public class MultiplesOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if (num1 % num2 == 0) {
			System.out.printf("%d is a multiple of %d", num1, num2);
		}
		
		if (num2 % num1 == 0) {
			System.out.printf("%d is a multiple of %d", num2, num1);
		}
		
		if (num1 % num2 != 0) {
			System.out.printf("%d is not a multiple of %d", num1, num2);
		}
		
	}

}
