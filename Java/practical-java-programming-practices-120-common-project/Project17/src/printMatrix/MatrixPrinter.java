/**
 * 
 */
package printMatrix;
import java.io.*;

/**
 * @author DHREY
 * 
 * How to print input into matrix
 *
 */
public class MatrixPrinter 
{
	

	/**
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @
	 */
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[3][3];
		int x, y;
		System.out.println("Please, enter 9 Integer value: ");
		for(x = 0; x < 3; x++)
		{
			for(y = 0; y < 3; y++)
			{
				num1[x][y] = Integer.parseInt(br.readLine());
			}
			
		}
		for (x = 0; x < num1.length; x++)
		{
			for (y = 0; y < 3; y++)
			{
				System.out.print(" " + num1[x][y]);
			}
			System.out.println();
		}
	}
}