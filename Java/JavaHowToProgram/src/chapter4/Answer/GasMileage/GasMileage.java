package chapter4.Answer.GasMileage;

import java.util.Scanner;

/*
 * 1. collect value of mile driven (integer)
 * 2. collect value of gallon used (integer)
 * 3. calculate and display mile per gallon for each trip
 * 4. total and display combined mile per gallon for all trips
 * 5. calculation should be in floating-point
 * 
 */

public class GasMileage {
	
	int miles;
	int gallons;
	double milages;
	//float totalMile, totalGallon;
	
	public GasMileage(int miles, int gallons) {
		this.miles = miles;
		this.gallons = gallons;
	}
		
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getGallons() {
		return gallons;
	}

	public void setGallons(int gallons) {
		this.gallons = gallons;
	}
 
	public void display() {
		System.out.println("Mileage Calculator for Automobiles");
		System.out.println("Enter mile and gallon used per each trip or enter n to quit\n");
	}
	
	public void calculateMilage() {
		
		//create scanner to collect input
		Scanner input = new Scanner(System.in);
		
		char cont =  'y';
		int mile = 0;
		int gallon = 0;
		double milage;
		
		while(cont != 'n') {
			
			System.out.print("Mile Driven: ");
			setMiles(input.nextInt());
		
			System.out.print("Gallon Driven: "); 
			setGallons(input.nextInt());
		
			milage = (double) getMiles() / getGallons();
			System.out.println("\t\nYour Miles per Gallon for this trip:");
			System.out.printf("Mile per Trip: %dmile\nGallon per Trip:%dgallon\nMile per Gallon:%.2fmpg%n", getMiles(), getGallons(), milage);

			System.out.print("\nAdd another trip? (y/n): ");
	        cont = input.next().charAt(0);
	        
			mile += getMiles();
			gallon += getGallons();
			
	        }
	        
	        if(cont == 'n') {
	        	milages = (double) mile / gallon;
	        	System.out.println("\nCOMBINED TOTAL MPG");
		        System.out.printf("Combined miles: %d\nCombined gallons useage: %d\n", mile, gallon);
		        System.out.printf("Total milages: %.2f mpg", milages);
		  input.close();
	     }
	}
}