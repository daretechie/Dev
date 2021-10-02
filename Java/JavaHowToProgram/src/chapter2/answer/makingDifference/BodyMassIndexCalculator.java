package chapter2.answer.makingDifference;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 * 
 * Body Mass Index Calculator
 *
 */

public class BodyMassIndexCalculator {
	
	public static void main(String[] args) {
	
	double weightInKilograms, heightInMeters, BMI, BMI1 = 18.5, BMI2 = 24.9, BMI4 = 30;
	
	System.out.println("\t\tBODY MASS INDEX CALCULATOR");
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Please enter your weight in Kilograms: ");
	weightInKilograms = userInput.nextDouble();
	
	System.out.print("Please enter your height in Meters: ");
	heightInMeters = userInput.nextDouble();
	
	userInput.close();
	
	BMI = weightInKilograms / (heightInMeters * heightInMeters);
	
	/*
	 * BMI VALUES
		Underweight: less than 18.5
		Normal: between 18.5 and 24.9
		Overweight: between 25 and 29.9
		Obese: 30 or greater
		
	 */
	
	System.out.println();
	
	if(BMI < BMI1) {
		System.out.printf("Your Body Mass Index value: %f%nYou are Underweight.%n", BMI);
	}
	
	if(BMI1 >= BMI2) {	
		System.out.printf("Your Body Mass Index value: %f%nYou are Normal.%n", BMI);
	}
	
	if(BMI4 < BMI2) {		
		System.out.printf("Your Body Mass Index value: %f%nYou are Overweight.%n", BMI);
	}
	
	if(BMI >= BMI4) {
		System.out.printf("Your Body Mass Index value: %f%nYou are Obese.%n", BMI);
	}

	}
}