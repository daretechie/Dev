/**
 * 
 */
package matrixAddition;

import java.io.*;

/**
 * @author DHREY
 * 
 * How to add in Matrix
 *
 */
public class AddMatrix 
{
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[2][2];
		int num2[][] = new int[2][2];
		int num3[][] = new int[2][2];
		int x, y;
		
		// the first matrix
		System.out.println("Please insert 1st integer values for matrix addition: ");
		for(x = 0; x < 2; x++) 
		{
			for(y = 0; y < 2; y++) 
			{
				num1[x][y] = Integer.parseInt(br.readLine());
			}
		}
		for(x = 0; x < num1.length; x++)
		{
			for (y = 0; y < 2; y++) 
			{
				System.out.print(" " + num1[x][y]);
			}
			System.out.println();
		}
		
		//the second matrix
		System.out.println("Please insert 2nd integer values for matrix addition: ");
		for(x = 0; x < 2; x++) 
		{
			for(y = 0; y < 2; y++) 
			{
				num2[x][y] = Integer.parseInt(br.readLine());
			}
		}
		for(x = 0; x < num2.length; x++)
		{
			for (y = 0; y < 2; y++) 
			{
				System.out.print(" " + num2[x][y]);
			}
			System.out.println();
		}
		
		// code for matrix addition of num1 and num2
		for(x = 0; x < 2; x++) 
		{
			for(y = 0; y < 2; y++) 
			{
				num3[x][y] = num1[x][y] + num2[x][y];
			}
		}
		System.out.println("The sum of the matrix is: ");
		for(x = 0; x < 2; x++)
		{
			for(y = 0; y < 2; y++)
			{
				System.out.print(" " + num3[x][y]);
			}
			System.out.println();
		}
				
	}

}