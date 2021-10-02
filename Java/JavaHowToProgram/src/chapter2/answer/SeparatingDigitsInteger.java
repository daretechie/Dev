package chapter2.answer;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class SeparatingDigitsInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5;
		System.out.print("Enter five integer: ");
		int n = sc.nextInt();
		
		sc.close();
		
		n1 = n / 10000;
		n2 = n % 10000 / 1000;
		n3 = n % 10000 % 1000 / 100;
		n4 = n % 10000 % 1000 % 100 / 10;
		n5 = n % 10000 % 1000 % 100 % 10;
		
		System.out.printf("%d   %d   %d   %d   %d", n1, n2, n3, n4, n5);

	}

}
