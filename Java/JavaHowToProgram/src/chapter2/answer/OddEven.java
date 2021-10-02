package chapter2.answer;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		
		sc.close();
		
		if(num1 % 2 == 0) {
			System.out.printf("%d is Even", num1);
		}
		
		if(num1 % 2 != 0) {
			System.out.printf("%d is Odd", num1);
		}


	}

}
