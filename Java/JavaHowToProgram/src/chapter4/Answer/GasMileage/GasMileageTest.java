/**
 * 
 */
package chapter4.Answer.GasMileage;

import java.util.Scanner;

/**
 * @author DHREY
 *
 */
public class GasMileageTest {
	
	int mile, gallon;

	public static void main(String[] args) {
		
		GasMileage objGasMileage = new GasMileage(0, 0);
		
		Scanner input = new Scanner(System.in);
		
		objGasMileage.display();
		objGasMileage.calculateMilage();
		
		input.close();
		
	}

}
