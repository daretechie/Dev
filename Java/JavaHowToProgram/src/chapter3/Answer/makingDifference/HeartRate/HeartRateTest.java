package chapter3.Answer.makingDifference.HeartRate;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class HeartRateTest {

	public static void main(String[] args) {
		
		System.out.print("\t\tTarget-Heart-Rate Calculator\nWelcome, we ask for your Name and Date of Birth only\n\n");
		
		HeartRate user = new HeartRate("", "", 0, 0, 0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome! Enter your details bellow.");
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		user.setFirstName(firstName);
		
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		user.setLastName(lastName);
		
		System.out.println("\nEnter date of birth, all in figure");
		System.out.print("Day of Birth: ");
		int day = input.nextInt();
		user.setDay(day);
		
		System.out.print("Month of Birth: ");
		int month = input.nextInt();
		user.setMonth(month);
		
		System.out.print("Year of Birth: ");
		int year = input.nextInt();
		user.setYear(year);
		input.close();
		
		user.displayUserInfo(user);
	}
}
