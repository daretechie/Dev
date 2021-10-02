package chapter2.answer.makingDifference;

import java.util.Scanner;

public class Car_PoolSavingsCalculator {

	public static void main(String[] args) {
		
		double milesPerDay, costPerGallon, parkingFeePerDay, gallonPerMile;
		double tollPerDay, dailyDrivingCost;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to calculate your driving cost.\n");
		System.out.println("Enter total miles driven per day: ");
		milesPerDay = userInput.nextDouble();
		
		System.out.println("Enter cost per gallon of gasoline: ");
		costPerGallon = userInput.nextDouble();
		
		System.out.println("Enter gallon per mile: ");
		gallonPerMile = userInput.nextDouble();
		
		System.out.println("Enter parking fee per day: ");
		parkingFeePerDay = userInput.nextDouble();
		
		System.out.println("Enter tolls per day: ");
		tollPerDay = userInput.nextDouble();
		
		
		userInput.close();

		
		dailyDrivingCost = ((milesPerDay / gallonPerMile) * costPerGallon) + tollPerDay + parkingFeePerDay;
		
		System.out.println("\nYour daily driving cost: " + dailyDrivingCost);

	}

}
