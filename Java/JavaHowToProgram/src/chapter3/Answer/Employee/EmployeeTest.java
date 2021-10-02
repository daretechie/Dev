package chapter3.Answer.Employee;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee staff1 = new Employee("", "", 0.0);
		Employee staff2 = new Employee("", "", -8);
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter staff first name: ");
		String firstName = input.nextLine();
		staff1.setFirstName(firstName);
		
		
		System.out.print("Enter staff second name: ");
		String lastName = input.nextLine();
		staff1.setLastName(lastName);
		
		System.out.print("Enter staff salary: " + "");
		double salary = input.nextDouble();
		staff1.paidSalary(salary);
		
		//staff2
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter staff first name: ");
		String firstName2 = input1.nextLine();
		staff2.setFirstName(firstName2);
		
		
		System.out.print("Enter staff second name: ");
		String lastName2 = input1.nextLine();
		staff2.setLastName(lastName2);
		
		System.out.print("Enter staff salary: ");
		double salary2 = input1.nextDouble();
		staff2.paidSalary(salary2);
		System.out.println("\n");
		input.close();
		input1.close();
		
		System.out.println("\tEMPLOYEE PAY ROLL\nFIRST NAME \tSECOND NAME \tSALARY");
		System.out.println(staff1.getFirstName() + "\t\t" + staff1.getLastName() + "\t\t" + staff1.getSalary());
		System.out.println(staff2.getFirstName() + "\t\t" + staff2.getLastName() + "\t\t" + staff2.getSalary());
		
		
		//10% increase
		staff1.salary_increase();
		staff2.salary_increase();
		
		System.out.println("\nStaff Salary After 10% increase");
		System.out.println(staff1.getFirstName() + "\t\t" + staff1.getLastName() + "\t\t" + staff1.salary_increase());
		System.out.println(staff2.getFirstName() + "\t\t" + staff2.getLastName() + "\t\t" + staff2.salary_increase());
		



	}

}
