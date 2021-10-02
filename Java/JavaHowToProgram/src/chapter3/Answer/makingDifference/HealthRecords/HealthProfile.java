package chapter3.Answer.makingDifference.HealthRecords;

public class HealthProfile 
{
	
	String firstName;
	String lastName;
	String gender;
	double height;
	double weight;
	int month;
	int day;
	int year;
	
	
	public HealthProfile(String firstName, String lastName, String gender, double height, double weight, int month, int day, int year)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.month = month;
		this.day = day;
		this.year = year;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public int personAge(int userAge) {
		userAge = 2020 - year;
		return userAge;
	}
	
	public int maximumHeartRate() {
		int maxRate = 220 - (2020 - year); 
		return maxRate;
	}
	
	public void targetHeartRate() {
		double targetMinRate, targetMaxRate;
		
		targetMinRate = Math.ceil((50 / 100.0) * maximumHeartRate());
		targetMaxRate = Math.ceil((85 / 100.0) * maximumHeartRate()); 
		System.out.printf("Target Heart Rate: %.0f to %.0f beats per minute%n%n", targetMinRate, targetMaxRate);
	}
	
	public void displayUserInfo(HealthProfile userInfo) {
		String firstName = userInfo.getFirstName();
		String lastName = userInfo.getLastName();
		int day = userInfo.getDay();
		int month = userInfo.getMonth();
		int year = userInfo.getYear();
		int age = personAge(getYear());
		double weight = userInfo.getWeight();
		double height = userInfo.getHeight();
				
		System.out.printf("\t\tAwesome! Patient Details:%nFirst Name: %s%nLast Name: %s%nDate of Birth: %d/%d/%d%nAge: %dyear%nWeight: %.2f%nHeight: %.2f%n", firstName, lastName, month, day, year, age, weight, height);
		System.out.println("\nMaximum Heart Rate: " + maximumHeartRate() + " beats per minute");
		targetHeartRate();
		
	}
	
	public void calculateBMI()
	{
		double weightInPound, heightInInches, BMI, BMI1 = 18.5, BMI2 = 24.9, BMI4 = 30;
		
		HealthProfile patient = new HealthProfile(firstName, firstName, firstName, height, height, day, day, day);
		weightInPound = patient.getWeight();
		heightInInches = patient.getWeight();
		
		BMI = (weightInPound / heightInInches / heightInInches) * 703;
		
		if(BMI < BMI1)
		{
			System.out.printf("Body Mass Index(BMI): %f%n\tYou are Underweight.%n", BMI);
		}
		
		if(BMI1 >= BMI2) 
		{	
			System.out.printf("Body Mass Index(BMI): %f%n\tYou are Normal.%n", BMI);
		}
		
		if(BMI4 < BMI2) 
		{		
			System.out.printf("Body Mass Index(BMI): %f%n\tYou are Overweight.%n", BMI);
		}
		
		if(BMI >= BMI4) 
		{
			System.out.printf("Body Mass Index(BMI): %f%n\tYou are Obese.%n", BMI);
		}
	}
	

}
