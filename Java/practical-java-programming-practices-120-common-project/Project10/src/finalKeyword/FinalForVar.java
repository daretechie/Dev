/**
 * 
 */
package finalKeyword;

/**
 * @author DHREY
 *
 */

/**
 * HOW TO USE final KEYWORD AS A VARIABLE
 */
public class FinalForVar {
	
	final int Reg_No;
	FinalForVar (int num) {
		Reg_No = num;
	}
	
	void display() {
		System.out.println("Employee number is: " + Reg_No);
	}
	

	public static void main(String[] args) {
		FinalForVar ky = new FinalForVar(201);
		ky.display();

	}

}
