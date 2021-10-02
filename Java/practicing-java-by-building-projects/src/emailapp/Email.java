package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String company = "semicolon.africa";
	
	//set no-argument constructor
	public Email() {}
	
	//set constructor to receive first and last name
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;

		//this.department = setDepartment();
		//this.password = randomPassword(defaultPasswordLength);
		
	}
	
	public String emailGenerator()
	{
		department = setDepartment();
		return getFirstName().toLowerCase() + "." + getLastName().toLowerCase() + "@" + department + "." + company;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//Ask for the department
	private String setDepartment() 
	{
		System.out.print("CODE\tDEPARTMENT\n1\tSales\n2\tDevelopment\n3\tAccounting\nEnter your department code: ");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		input.close();
		if(depChoice == 1) {return "Sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return "";}
	}
	
	private String randomPassword(int length1)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length1];
		for(int i = 0; i < length1; i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	//Change password method
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	//Generate alternative email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//Getter method to receive mail box capacity
	//change password
	//generate alternate email
	public int getMailBoxCapacity() {return mailboxCapacity;}
	public String getPassword() {return password;}
	public String getAlternateEmail() {return alternateEmail;}
	
	public String displayInfo() {
		
		System.out.println("\t\tsemicolon Africa group of company".toUpperCase());
		System.out.println("Welcome to the Email Generator\n");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		setFirstName(firstName);
		
		System.out.print("Enter your last name: ");
		lastName = input.nextLine();
		setLastName(lastName);
	
		
		return "\n\tWelcome to our commpany, "+getFirstName()
				+ "\nNAME: " + getFirstName() + " " + getLastName() +
				"\nCOMPANY EMAIL: " + emailGenerator() + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb"+
				"\nPASSWORD: " + randomPassword(defaultPasswordLength);
	}


}
