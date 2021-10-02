package chapter5.Answer.ModifiedCompoundInterest2;

public class ModifiedCompoundInterest2 
{
		   public static void main(String args[])
		   {
		      int amount; // amount on deposit at end of each year
		      int principal = 100000; // initial amount before interest
		      double rate = .05; // interest rate

		      // display headers
		      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

		      // calculate amount on deposit for each of ten years
		      for (int year = 1; year <= 10; year++) 
		      {
		         // calculate new amount for specified year
		   
		         amount = (int)(principal * Math.pow(1 + rate, year));
		         
		         int dollar =  amount / 100;
		         int cent = amount % 100;

		         // display the year and the amount
		         System.out.printf("%4d%,20d.", year, dollar);
		         
		         if (cent < 10) {System.out.printf("0%d%n", cent);} 
		         else {System.out.printf("%d%n", cent);} 
		        	 
		      }// end class Interest
 
	      
	      int i = 1, j = 2, k = 3, m = 2;
	      
	      System.out.println(i == 1);
	      System.out.println(j == 3);
	      System.out.println((i >= 1) && (j < 4));
	      System.out.println((m <= 99) & (k < m));
	      System.out.println((j >= i) || (k == m));
	      System.out.println((k + m < j) | (3 - j >= k));
	      System.out.println(!(k > m));
	   }

}
