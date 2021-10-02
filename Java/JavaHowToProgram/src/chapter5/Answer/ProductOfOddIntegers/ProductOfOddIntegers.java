package chapter5.Answer.ProductOfOddIntegers;

public class ProductOfOddIntegers 
{
	
	public void totalProductOfOdd()
	{
		System.out.println("\tThe total product of odd number from 1 - 15\n".toUpperCase());
		int totalProduct = 1;
	for(int i = 1; i <= 15; i++) {
		
		if(i % 2 == 1)
			totalProduct *= i;
	}
	System.out.println("The total product is "+ totalProduct);
	}
	public static void main(String[] args) {
		
		ProductOfOddIntegers obj = new ProductOfOddIntegers();
		obj.totalProductOfOdd();

	}

}
