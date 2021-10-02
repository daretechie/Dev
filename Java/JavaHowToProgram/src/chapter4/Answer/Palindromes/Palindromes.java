package chapter4.Answer.Palindromes;

import java.util.Scanner;

/*
 * Not working perfectly :validation not working
 * 
 */

public class Palindromes {
	
	int firstDigit;
	int secondDigit;
	int thirdDigit;
	int forthDigit;
	int fifthDigit;
	int digits;
	

	public static void main(String[] args) 
	{
		Palindromes palindromes = new Palindromes();
		palindromes.input();
	
	}
	
	public void setDigits(int digits) {
		this.digits = digits;
	}
	
	private int getDigits() {
		return digits;
	}

	
	public void input() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\tPALINDROMES PROGRAM\n");
		System.out.print("Enter five digit number: ");
		int digits = input.nextInt();
		setDigits(digits);
		
		//To validate that only five digit integer was inputed by user
		//And calculate the palindrome			
			
		while(digits != 5)
		{
			if((digits > 9999) && (digits <= 99999))
			{ 				
				digits = 5;	
			}
			else
				{
					System.out.println("Incorrect, enter only five-digit integer.");
					System.out.print("\nEnter five-digit integer:");
					digits = input.nextInt();
					setDigits(digits);
				}
		}
		
		if(digits == 5) 
		{
			isPalindromes();
		}
		
		input.close();
	}
		
		public void splitDigit()
		{
			firstDigit = getDigits() / 10000;
			secondDigit = getDigits() % 10000 / 1000;
			thirdDigit = getDigits() % 10000 % 1000 / 100;
			forthDigit = getDigits() % 10000 % 1000 % 100 / 10;
			fifthDigit = getDigits() % 10000 % 1000 % 100 % 10;
		}
		
		public void isPalindromes()
		{
			splitDigit();
			if ((firstDigit == fifthDigit) && (secondDigit == forthDigit))
			{
			System.out.println(getDigits() + " is a palindromes.");
			}
			else 
			{
				System.out.println(getDigits() + " is not a palindromes.");
			}
		}
}