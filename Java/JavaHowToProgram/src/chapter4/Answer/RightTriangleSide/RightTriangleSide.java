package chapter4.Answer.RightTriangleSide;

import java.util.Scanner;

public class RightTriangleSide {
	
	public static void main(String[] args) 
	{
		RightTriangleSide obj = new RightTriangleSide();
		
		obj.userInput(0, 0, 0);
		

	}
	
	public void userInput(int a, int b, int c) 
	{
		Scanner input =new Scanner(System.in);
		
		System.out.println("\tRIGHT TRIANGLE FORMATION");
		
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
		
			System.out.printf("\nYour input could%s form a Right Triangle",(isRightTriangle(a, b, c) ? "" : " not"));
		}
		input.close();
		
	}
	
	//let know if the input can make a triangle
	public boolean isTriangleSides(int a, int b, int c)
	{
		return ((a + b > c) && (a + c > b) && (b + c > a));
	}
	
	public boolean isRightTriangle(int a, int b, int c)
	{
		int hypotenuse;
		// second use pythgoras theorem to determine if is a right triangle
		// that hypotenuse is longer than opposite and adjacent
	    // 
		
		if(a > b && a > c) 
		{
			hypotenuse = a;
		}
		else if(b > a && b > c)
		{
			hypotenuse = b;
		}
		else 
		{
			hypotenuse = c;
		}
		isTriangleSides(0, 0, 0);
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2);
	}

}
