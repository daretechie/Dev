package chapter3.Answer.makingDifference.HeartRate;

/**
 * 
 * @author DHREY
 *
 */

public class HeartRate {
	String firstName, lastName;
	int month, day;
	int year;
	
	public HeartRate(String firstName, String lastName, int month, int day, int year) {
		
		this.firstName = firstName;
		this.lastName = lastName;
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
		System.out.printf("Target Heart Rate: %.0f to %.0f beats per minute", targetMinRate, targetMaxRate);
	}
	
	public void displayUserInfo(HeartRate userInfo) {
		String firstName = userInfo.getFirstName();
		String lastName = userInfo.getLastName();
		int year = personAge(getYear());
				
		System.out.printf("%n%nAwesome! Your Details are:%n%s %s %dyears", firstName, lastName, year);
		System.out.println("\nMaximum Heart Rate: " + maximumHeartRate() + " beats per minute");
		targetHeartRate();
		
	}

}
