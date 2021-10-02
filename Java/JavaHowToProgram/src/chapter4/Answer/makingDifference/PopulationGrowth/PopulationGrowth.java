package chapter4.Answer.makingDifference.PopulationGrowth;

public class PopulationGrowth {
	
	double currentPop = 7790000000l;
	double increaseValue;
	double growthRate = 1.17 / 100;
		
	public void calculatePop() 
	{
		System.out.println("\tanticipated World Population Growth for the next 75 years\n".toUpperCase());
		System.out.printf("%s\t\t%s\t\t%s%n","Year", "Anticipated Pop","Increase Pop");
		
		for(int i = 1; i <= 75; i++)
		{			
			increaseValue = currentPop * growthRate;
			currentPop += (currentPop * growthRate);
			System.out.printf(" %d\t\t|%.0f\t\t|%.0f%n",i,currentPop,increaseValue);
		}	
	}
	public static void main(String[] args) {
		PopulationGrowth obj = new PopulationGrowth();
		
		obj.calculatePop();
		
	}
}
