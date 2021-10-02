package chapter4.Answer.makingDifference.Cryptography;

import java.util.Scanner;

public class Encryption {
	
	int firstDigit;
	int secondDigit;
	int thirdDigit;
	int forthDigit;
	int digits;
	
	
	
	public int getDigits() 
	{
		return digits;
	}

	public void setDigits(int digits) 
	{
		this.digits = digits;
	}

	public void displayMsg()
	{
		System.out.println("\t\tEnforcing Privacy with Cryptography".toUpperCase());
	}
	
	@SuppressWarnings("resource")
	public void input()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter four-digit integer:");
		int digits = input.nextInt();
		setDigits(digits);
		
		while(digits != 4)
		{
			if((digits > 999) && (digits < 10000))
			{
				digits = 4;	
			}
			
			else
			{
				System.out.println("Incorrect, enter only four-digit integer.");
				System.out.print("\nEnter four-digit integer:");
				digits = input.nextInt();
				setDigits(digits);
			}
		}
		
		if(digits == 4) 
		{
			encryptData();
		}
	}
	
	public void splitDigit()
	{
		firstDigit = getDigits() / 1000;
		secondDigit = getDigits() % 1000 / 100;
		thirdDigit = getDigits() % 1000 % 100 / 10;
		forthDigit = getDigits() % 1000 % 100 % 10;
	}
	
	public void encryptedDisplay() 
	{	
		//display the encrypted digit
		System.out.printf("Encrypted Data: %s%s%s%s", firstDigit, secondDigit, thirdDigit, forthDigit);
	}

	public void encryptData() 
	{
		splitDigit();
		
		//to encrypt the data
		firstDigit = ((firstDigit + 7) % 10);
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		forthDigit = (forthDigit + 7) % 10;
		
		int temp;
		
		//swamping of digit
		temp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp;
		
		temp = secondDigit;
		secondDigit = forthDigit;
		forthDigit = temp;
		encryptedDisplay();
	}
}
