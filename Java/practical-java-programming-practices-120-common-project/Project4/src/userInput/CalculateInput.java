/**
 * 
 */
package userInput;

import java.io.*;

/**
 * @author DHREY
 *
 */
public class CalculateInput {

	public static void main(String[] args) throws IOException {
		
		int num1, num2, output, output1, output2, output3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter a number: ");
		num2 = Integer.parseInt(br.readLine());
		
		output = num1 + num2;
		output1 = num1 * num2;
		output2 = num1 / num2;
		output3 = num1 - num2;
		System.out.println("Result is: " + output);
		System.out.println("Result is: " + output1);
		System.out.println("Result is: " + output2);
		System.out.println("Result is: " + output3);

	}

}
