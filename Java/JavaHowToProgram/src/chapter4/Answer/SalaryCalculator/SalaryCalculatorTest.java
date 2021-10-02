package chapter4.Answer.SalaryCalculator;

import java.util.Scanner;

public class SalaryCalculatorTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		
		salaryCalculator.displayMessage();
		
		input.close();

	}

}
