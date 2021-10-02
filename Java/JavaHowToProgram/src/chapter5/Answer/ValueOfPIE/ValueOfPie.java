package chapter5.Answer.ValueOfPIE;

public class ValueOfPie 
{
	public static void main(String[] args) {
		double pieValue = 0;
		double number = 4;
		double denominator = 1.0;
		int maxTerm = 200000;
		double maxPieValue =3.14159;
		
		
		for(int i = 1; i <= maxTerm; i++)
		{
			if (maxPieValue == pieValue) break;
			
			if(i % 2 != 0) {pieValue += number / denominator;}
			
			else {pieValue -= number / denominator;}
			
			System.out.printf("%d\t\t%.5f\n",i,pieValue);
			
			denominator += 2.0;	
		}
	}
}
