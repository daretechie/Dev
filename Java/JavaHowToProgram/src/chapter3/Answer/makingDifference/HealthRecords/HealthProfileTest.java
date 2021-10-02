package chapter3.Answer.makingDifference.HealthRecords;

import java.util.Scanner;

public class HealthProfileTest {
	
	public static void main(String[] args) 
	{
		HealthProfile patient = new HealthProfile("", "", "", 0, 0, 0, 0, 0);
		
		System.out.println("\t\tSEMICOLON HEALTH SERVICES\n");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome! Enter your details bellow.");
		//collect first name
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		patient.setFirstName(firstName);
		
		//collect second name
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		patient.setLastName(lastName);
		
		//collect gender
		System.out.print("Gender: ");
		String gender = input.nextLine();
		patient.setGender(gender);
		
		//collect day of birth
		System.out.println("\nEnter date of birth, all in figure");
		System.out.print("Day of Birth: ");
		int day = input.nextInt();
		patient.setDay(day);
		
		System.out.print("Month of Birth: ");
		int month = input.nextInt();
		patient.setMonth(month);
		
		System.out.print("Year of Birth: ");
		int year = input.nextInt();
		patient.setYear(year);
		
		
		System.out.print("Weight in Pound: ");
		double weightInPound = input.nextDouble();
		patient.setWeight(weightInPound);
		
		System.out.print("Height in Inches: ");
		double heightInInches = input.nextDouble();
		patient.setHeight(heightInInches);
		
		input.close(); //closing resource leak
		
		System.out.println("\n\t\tSEMICOLON HEALTH SERVICES\n");
		patient.displayUserInfo(patient);
		patient.calculateBMI();
		
		
	}

}
