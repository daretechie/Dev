package chapter2.answer;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class DiameterCircumferenceAreaCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int radius;
		float diameter, cirircumference, area;
		
		System.out.print("Enter radius of a circle: ");
		radius = sc.nextInt();
		
		sc.close();
		
		diameter = 2 * radius;
		cirircumference = (float) ((float)2 * radius * Math.PI);
		area = (float) Math.PI * (radius * radius);
		
		System.out.println("The diameter is " + diameter);
		System.out.println("The cirircumference is " + cirircumference);
		System.out.println("The is area is " + area);
		
	}

}
