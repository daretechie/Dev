package chapter2.answer.makingDifference;
/**
 * 
 * @author DHREY
 *
 */

import java.util.Scanner;

/**
 * Sources of Data is https://www.worldometers.info/ 
 * and https://en.wikipedia.org/wiki/Population_growth
 * 
 * 
 * 7.79 billion is the Current World Population
 * 
 * current growth rate is 1.1% 
 */


public class WorldPopulationGrowthCalculator {

	public static void main(String[] args) {
		
		double currentPop;
		double growthRate;
		double year1, year2, year3, year4, year5;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please, enter current world population: ");
		currentPop = userInput.nextDouble();
		
		System.out.println("Please, enter current world population: ");
		growthRate = userInput.nextDouble();
		
		userInput.close();
		
		growthRate /= 100;		
		
		year1 = currentPop + (currentPop * growthRate);
		year2 = year1 + (year1 * growthRate);
		year3 = year2 + (year2 * growthRate);
		year4 = year3 + (year3 * growthRate);
		year5 = year4 + (year4 * growthRate);
		
		System.out.println("The Estimated world population a year to this time is "+ year1);
		System.out.println("The Estimated world population two years to this time is "+ year2);
		System.out.println("The Estimated world population three years to this time is "+ year3);
		System.out.println("The Estimated world population four years to this time is "+ year4);
		System.out.println("The Estimated world population five years to this time is "+ year5);

	}

}
