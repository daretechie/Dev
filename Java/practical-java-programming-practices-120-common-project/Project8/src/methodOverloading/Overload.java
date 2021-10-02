/**
 * 
 */
package methodOverloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DHREY
 *
 */
public class Overload {

	String add(String a, String b) {
		return (a + " " + b);
	}
}

class StringOverload {
	
	public static void main(String[] args) throws IOException {
		String x, y;
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please, enter two values: ");
		x = br.readLine();
		y = br.readLine();
		
		Overload ol= new Overload();
		System.out.println("Result of your two values are: " + ol.add(x, y));


	}

}
