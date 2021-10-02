package chapter2.answer;
import java.util.*;

public class Arithmetic {

	public static void main(String[] args) {
		
		int sum, product, diff;
		float div;
		Scanner sc = new Scanner(System.in);
		System.out.println("\tProgram to find the sum, product, division and subtraction of two integer.");
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		
		System.out.format("\nYour number are: %d and %d\n", num1, num2);
		
		sc.close();
		
		sum = num1 + num2;
		product = num1 * num2;
		diff = num1 - num2;
		div = num1 / num2;
		
		System.out.println("\nThe addition is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The diff is " + diff);
		System.out.println("The div is " + div);
	
	}

}
