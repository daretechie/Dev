package chapter3.Answer.Date;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		Date newDate = new Date(0, 0, 0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to your Date Display\n");
		System.out.print("Enter month in number: ");
		int month = input.nextInt();
		newDate.setMonth(month);
		
		System.out.print("Enter day: ");
		int day = input.nextInt();
		newDate.setDay(day);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		newDate.setYear(year);
		input.close();
		
		newDate.displayDate(newDate.getMonth(), newDate.getDay(), newDate.getYear());

	}

}
