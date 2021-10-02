package chapter5.Answer.ModifiedCompoundInterest;

public class ModifiedCompoundInterest 
{
	   public static void main(String args[])
	   {
	      double amount = 0; // amount on deposit at end of each year
	      double principal = 1000.0; // initial amount before interest
	     double rateVal = 0; // interest rate
	     double rate;

	      // display headers
	      System.out.printf("  %s%25s(%d%%)%20s(%d%%)%20s(%d%%)%20s(%d%%)%20s(%d%%)%20s(%d%%)%n", "Year", "Amount on deposit", 5, "Amount on deposit", 6,
	    		  "Amount on deposit", 7,"Amount on deposit", 8,"Amount on deposit", 9,"Amount on deposit", 10);

	      // calculate amount on deposit for each of ten years
	      for (int year = 1; year <= 10; year++) 
	      {
	    	  System.out.printf("%4d", year);
	    	  for(rate = 5; rate <= 10; rate++)
	    	  {
	    		  rateVal = rate / 100;
	    		  amount = principal * Math.pow(1.0 + rateVal, year);
	    		  
	    		  System.out.printf("%25.2f", amount);
	    		  
	    	  }
	    	  //System.out.printf("%20s%f","Amount on deposit", (rate + 1));
	    	  System.out.println();
	         // calculate new amount for specified year
	         // display the year and the amount
	         
	      } 
	   }
}
