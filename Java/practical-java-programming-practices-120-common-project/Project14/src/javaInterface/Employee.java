/**
 * 
 */
package javaInterface;
import java.io.*;

/**
 * @author DHREY
 *
 */
public class Employee 
	{
	int Reg_No, Rt1, Rt2, Rt3;
	String name;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void getInput() throws Exception 
	{
		System.out.println("Please enter Employee details: Reg_No, Name, Skill Levels of Java, Python, PHP");
		System.out.println("Enter Reg_No: ");
		Reg_No = Integer.parseInt(br.readLine());
		System.out.println("Enter Name: ");
		name = br.readLine();
		System.out.println("Enter Java skill rate: ");
		Rt1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Python skill rate: ");
		Rt2 = Integer.parseInt(br.readLine());
		System.out.println("Enter PHP skill rate: ");
		Rt3 = Integer.parseInt(br.readLine());	
	}
	
	void display() 
	{
		System.out.println("Your Reg_No is: " + Reg_No);
		System.out.println("Your Name is: " + name);
		System.out.println("Your Java skill is: " + Rt1);
		System.out.println("Your Python is: " + Rt2);
		System.out.println("Your PHP is: " + Rt3);
	}
}

	class Output extends Employee 
	{	
		int total;
		float average;
		
		void evaluate() throws Exception 
		{
			getInput();
			total = Rt1 + Rt2 + Rt3;
			average = (float) total/3;		
		}
	
	void screenShow() {
		System.out.println("Overall Rating is: " + total);
		System.out.println("Your average skill rate is: " +  average);
	}
}

class Company 
	{
	public static void main(String[] args) throws Exception {
		
		Output ot = new Output();
		ot.evaluate();
		ot.display();
		ot.screenShow();
	}
}

