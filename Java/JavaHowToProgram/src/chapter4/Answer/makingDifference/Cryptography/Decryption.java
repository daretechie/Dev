package chapter4.Answer.makingDifference.Cryptography;

import java.util.Scanner;

public class Decryption {
	
	int firstDigit;
	int secondDigit;
	int thirdDigit;
	int forthDigit;
	int digits;
	
	public int getDigits() {
		return digits;
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}

	public void inputForDecrypt()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nEnter four-digit integer for decryption:");
		int digits = input.nextInt();
		setDigits(digits);
		
		while(digits >= 10000)
		{
			System.out.println("Incorrect, enter only four-digit integer.");
			System.out.print("\nEnter four-digit integer for decryption:");
			digits = input.nextInt();
			setDigits(digits);
		}
		if(digits < 10000)
		{
			decryptData();	
		}
		input.close();
	}
	
	public void splitDigit()
	{
		//splitting of digits
		firstDigit = getDigits() / 1000;
		secondDigit = getDigits() % 1000 / 100;
		thirdDigit = getDigits() % 1000 % 100 / 10;
		forthDigit = getDigits() % 1000 % 100 % 10;
	}
	
	public void decryptedDisplay() 
	{	
		//displaying the decrypted digit
		System.out.printf("Decrypted Data: %d%d%d%d", firstDigit, secondDigit, thirdDigit, forthDigit);
	}

	public void decryptData() 
	{
		splitDigit();
		int temp;
		
		//swamping of digit
		temp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp;
		
		temp = secondDigit;
		secondDigit = forthDigit;
		forthDigit = temp;
		
		//necessary calculation to decode the encrypted data
		firstDigit = (firstDigit >= 7) ? (firstDigit - 7) : (firstDigit + 10) - 7;
		secondDigit = (secondDigit >= 7) ? (secondDigit - 7) : (secondDigit + 10) - 7;
		thirdDigit = (thirdDigit >= 7) ? (thirdDigit - 7) : (thirdDigit + 10) - 7;
		forthDigit = (forthDigit >= 7) ? (forthDigit - 7) : (forthDigit + 10) - 7;
		 
		decryptedDisplay();
	}
}

