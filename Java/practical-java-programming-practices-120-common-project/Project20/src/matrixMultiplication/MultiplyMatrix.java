/**
 * 
 */
package matrixMultiplication;
import java.io.*;

/**
 * @author DHREY
 *
 */
public class MultiplyMatrix {

		public static void main(String[] args) throws NumberFormatException, IOException 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num1[][] = new int[4][4];
			int num2[][] = new int[4][4];
			int num3[][] = new int[4][4];
			int x, y, z;
		
			// the first matrix
			System.out.println("Please insert 1st integer values for matrix subtraction: ");
			for(x = 0; x < 4; x++) 
			{
				for(y = 0; y < 4; y++) 
				{
					num1[x][y] = Integer.parseInt(br.readLine());
				}
			}
			for(x = 0; x < num1.length; x++)
			{
				for (y = 0; y < 4; y++) 
				{
					System.out.print(" " + num1[x][y]);
				}
				System.out.println();
			}
			
			//the second matrix
			System.out.println("Please insert 4nd integer values for matrix subtraction: ");
			for(x = 0; x < 4; x++) 
			{
				for(y = 0; y < 4; y++) 
				{
					num2[x][y] = Integer.parseInt(br.readLine());
				}
			}
			for(x = 0; x < num2.length; x++)
			{
				for (y = 0; y < 4; y++) 
				{
					System.out.print(" " + num2[x][y]);
				}
				System.out.println();
			}
			
			// code for matrix multiplication of num1 and num2
			for(x = 0; x < 4; x++) 
			{
				for(y = 0; y < 4; y++) 
				{
					num3[x][y] = 0;
					for(z = 0; z < 4; z++)
					{
						num3[x][y] = num3[x][y] + (num1[x][z] * num2[z][y]);
					}
				}
			}
			
			System.out.println("The multiplication of the matrix is: ");
			for(x = 0; x < 4; x++)
			{
				for(y = 0; y < 4; y++)
				{
					System.out.print(" " + num3[x][y]);
				}
				System.out.println();
		}				
	}
}
