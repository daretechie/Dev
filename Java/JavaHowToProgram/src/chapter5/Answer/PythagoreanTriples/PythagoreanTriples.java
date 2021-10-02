package chapter5.Answer.PythagoreanTriples;

public class PythagoreanTriples {
	
	public static void main(String[] args) {
		
		System.out.println("\t\tPythagorean Triples Program\n".toUpperCase());
		
		System.out.printf("%s\t\t%s\t\t%s\t%s\t%s\n", "Side-1", "Side-2", "Hypotenuse",
				"((side1^2) + (side2^2))", "(hypotenuse^2)");
		for(int side1 = 1; side1 <= 500; side1++)
		{
			for(int side2 = 1; side2 <= 500; side2++)
			{
				for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
				{
					if((((side1 * side1) + (side2 * side2)) == (hypotenuse * hypotenuse)))
					{
						System.out.printf("%d\t\t%d\t\t%d\t\t   | %d%20d", side1, side2, hypotenuse, 
								((side1 * side1) + (side2 * side2)),(hypotenuse * hypotenuse));
						System.out.println();
					}
				}
			}
			
		}
	}

}
