package chapter3.Answer.Employee;

public class Employee {
	
	String firstName, lastName;
	double salary;
	
	
	public Employee(String firstName, String lastName, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		if(salary > 0.0) {
			this.salary = salary;
		}
	}
	public void paidSalary(double salaryAmount) {
			if(salaryAmount > 0.0) {
				salary += salaryAmount;
			}
	}
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//10% increment in salary
	public double salary_increase() {
		return ((0.1 * salary) + salary) * 12;
	}

}
