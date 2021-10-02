package chapter3.Answer.Date;

public class Date {
	int month, day, year;

	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
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
	
	
	public void displayDate(int month, int day, int year) {
		System.out.printf("%nThe Date is %d/%d/%d", month, day, year);
	}

}
