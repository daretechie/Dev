package chapter6.Answer.ParkingCharges;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 * 
 * 
 *1) calculate parking charged for yesterday(Display)
 *2) collect the hour used by customer
 *3) Calculate for today customer(Display)
 *4) calculate and display the running total of yesterday’s receipts
 *
 */

public class ParkingCharges {
	
	double minFee = 2.00;
	double hourSpent = 3;
	double additionalFee = 0.50; // per hour
	double maxFee = 10.00;  // per 24 hours
	
	
	public ParkingCharges(double minFee, int hourSpent, double additionalFee) {

		this.minFee = minFee;
		this.hourSpent = hourSpent;
		this.additionalFee = additionalFee;
	}


	public ParkingCharges() {
		// TODO Auto-generated constructor stub
	}

	public double getHourSpent() {
		return hourSpent;
	}

	public void setHourSpent(double hourSpent) {
		this.hourSpent = hourSpent;
	}
	
	public void displayMessage() {
		System.out.println("\t\tParking charges calculator".toUpperCase());
		System.out.println("Select an Option\nID\t\tOptions\n1\t\tToday\n2\t\tYesterday");
	}
	
	public double yesterdayCharges(double hours) {
		double totalCharged;
		
		totalCharged = calculateCharged(hours);
		return totalCharged;	
	}
	
	public double calculateCharged(double hours) {
		
		double usedHours, remHours, totalCharged;
		if(hours == 24) {
			totalCharged = maxFee;
		}
		
		else {
			usedHours = (int)(hours / 3);
			remHours = hours % 3;
			totalCharged = (usedHours * minFee) + (remHours * additionalFee);	
		}
		return totalCharged;	
	}
	
	public void parkingCalculator() {
		double hour, totalVal = 0, value, ID = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Select an option (-1 to quit): ");
		int id = input.nextInt();
		
		int num = 0;
		while(num != -1) {
			
			if (id == 1) {
				System.out.print("\nEnter hours spent by customer: ");
				hour = input.nextDouble();
				setHourSpent(hour);
				value = calculateCharged(getHourSpent());
				totalVal += value;
				System.out.printf("\nCustomer Charged: $%.2f\n",calculateCharged(getHourSpent()));
			}
			else if(id == 2) {
				System.out.print("Enter hours spent by the customer yesterday: ");
				hour = input.nextDouble();
				setHourSpent(hour);
				totalVal += calculateCharged(getHourSpent());
				System.out.printf("\nYesterday Customer Charged: $%.2f\n",yesterdayCharges(getHourSpent()));
			}
				
				System.out.println("Yesterday's receipts: $%.2f");
		}
	}
}

