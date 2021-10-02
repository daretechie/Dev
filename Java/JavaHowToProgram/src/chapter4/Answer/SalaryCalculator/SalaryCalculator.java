package chapter4.Answer.SalaryCalculator;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */
/*
 * Want to know the Gross pay for employee
 * pay for 40hours of work
 */

public class SalaryCalculator {
	
	double firstHour = 40;
	double excessHourRate = 1.5;
	double hourSpent;
	double hourWage;
	
	public double getHourSpent() {
		return hourSpent;
	}
	public void setHourSpent(double hourSpent) {
		this.hourSpent = hourSpent;
	}
	public double getHourWage() {
		return hourWage;
	}
	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
	}
	
	public void displayMessage() {
		System.out.println("SALARY CALCULATOR");
		Scanner input = new Scanner(System.in);
		
		for(int counter = 1; counter < 4; counter++) {
			System.out.printf("Enter hour spent by employee %d: ", counter);
			setHourSpent(input.nextDouble());
			System.out.printf("Enter wage per hour for employee %d: ", counter);
			setHourWage(input.nextDouble());
			
			System.out.println("\n********************\n");
			System.out.printf("Employee %d weekly hours spent: %.2f%nEmployee %d wage per hour: $%.2f", counter, getHourSpent(), counter, getHourWage());
			System.out.printf("%nEmployee %d gross pay: $%.2f", counter, calGrossPay());
			System.out.println("\n");
			
		}
		input.close();
	}
	 public double calGrossPay() {
		 return getHourSpent() > firstHour ? (getHourWage() * firstHour) 
				 + ((getHourWage() * excessHourRate) * (getHourSpent() - firstHour))
				 : (getHourSpent() * getHourWage());
	 }
}
