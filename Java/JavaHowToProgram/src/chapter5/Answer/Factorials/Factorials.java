package chapter5.Answer.Factorials;

public class Factorials {

	public static void main(String[] args) {
		long totalValue = 1;
		System.out.println("Factorials of 1-20\n\n".toUpperCase());
		System.out.printf("%s\t\t%s\n","n!","Value");
		for(int i = 1; i <= 20; i++)
		{
			totalValue *= i;
			System.out.printf("%d\t\t%d\n",i,totalValue);
		}
	}

}
