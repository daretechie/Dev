package chapter4.Answer.makingDifference.Cryptography;

//import java.util.Scanner;

public class CryptographyTest 
{

	public static void main(String[] args) 
	{
		//Scanner input = new Scanner(System.in);
		Encryption obj = new Encryption();
		Decryption obj1 = new Decryption();
		
		
		obj.displayMsg();
		obj.input();
		obj1.inputForDecrypt();
	}

}
