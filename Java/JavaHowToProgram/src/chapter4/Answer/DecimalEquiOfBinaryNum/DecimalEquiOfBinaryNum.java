package chapter4.Answer.DecimalEquiOfBinaryNum;

import java.util.Scanner;

public class DecimalEquiOfBinaryNum {
	
	int lastDigit, deciNum = 0;
	int positionValue = 0;
	int binaryNum;
	/**
	 * collect a binary number that is 0 and 1
	 * 
	 * out the decimal equivalent
	 * 
	 */
	public static void main(String[] args) {
		DecimalEquiOfBinaryNum obj = new DecimalEquiOfBinaryNum();
		
		obj.isDeciEquivalent();
	}
	
	public void isDeciEquivalent() {
	
		
		System.out.print("\tPrinting the Decimal Equivalent of a Binary Number\n".toUpperCase());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 0s and 1s for binary: ");
		int num = input.nextInt();
		binaryNum = num;
		while(binaryNum != 0) {
			
			//to know the last digit
			lastDigit = binaryNum % 10;
			
			deciNum += lastDigit * (int) Math.pow(2, positionValue);;
			
			binaryNum /= 10;
			positionValue++;
			
		}
		System.out.printf("%d = %d in Decimal", num, deciNum);
		input.close();
	}

}
