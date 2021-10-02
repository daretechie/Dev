package chapter4.Answer.TriangleSides;

import java.util.Scanner;

public class TriangleSides {

	public static void main(String[] args) 
	{
		TriangleSides obj = new TriangleSides();
		obj.userInput(0, 0, 0);
		

	}
	
	public void userInput(int a, int b, int c) 
	{
		Scanner input =new Scanner(System.in);
		
		System.out.println("\tTRIANGLE FORMATION");
		
		System.out.print("Enter first Nonzero integer : ");
		a = input.nextInt();
		while(a <= 0)
		{
			System.out.println("Oops!!! Nonzero integer only.\n");
			System.out.print("Enter first Nonzero integer: ");
			a = input.nextInt();
		}
		
		if (a != 0)
		{
			System.out.print("Enter second Nonzero integer: ");
			b = input.nextInt();
			System.out.print("Enter third Nonzero integer: ");
			c = input.nextInt();
		
			System.out.printf("\nYour input can%s form a Triangle",(isTriangleSides(a, b, c) ? "" : " not"));
		}
		input.close();
		
	}
	
	public boolean isTriangleSides(int a, int b, int c)
	{
		// using triangle inequality theorem to determine viability
	    // the sum of any 2 sides must be greater than the 3rd
	    // and must be true of all combinations
		return ((a + b > c) && (a + c > b) && (b + c > a));
	}

}
