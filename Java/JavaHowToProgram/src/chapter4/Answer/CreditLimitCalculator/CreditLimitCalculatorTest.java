package chapter4.Answer.CreditLimitCalculator;

import java.util.Scanner;

public class CreditLimitCalculatorTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(0, 0, 0, 0, 0);
		
		creditLimitCalculator.displayMessage();
		creditLimitCalculator.customerInput();
		creditLimitCalculator.calNewBalance();
		creditLimitCalculator.displayMsg();
		input.close();

	}

}
