/**
 * 
 */
package staticVariable;

/**
 * @author DHREY
 *
 */
public class Tutor {

	/**
	 * @How use Static Variable
	 */
	
	int Reg_No;
	String Name;
	static String Company = "Udemy";
	
	Tutor(int a, String b) {
		Reg_No = a;
		Name = b;
	}
	
	void display() {
		System.out.println("Your details are: " + Reg_No + " " + Name + " " + Company);
	}
	
	public static void main(String[] args) {
		
		Tutor tutor1 = new Tutor(201, "Tanimola");
		tutor1.display();
	}

}
