package chapter4.Answer.DanglingElseProblem;

public class DanglingElseProblem {
	
	public static void main(String[] args) {
		
	int x = 5, y = 8;
	
	System.out.println("\ta\n");
	
	if (y == 8)
		if (x == 5)
		System.out.println("@@@@@");
		else
		System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		
		System.out.println("\n\tb");
	if (y == 8) {
		if (x == 5) {
			System.out.println("@@@@@");
		}		
	}
	
	else {
		System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
	}
	
	System.out.println("\n\tc");
	
	x = 5; y = 7;
	if (y == 8) {
		if (x == 5) {
			System.out.println("@@@@@");
		}
	}
	else {
		System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
	}
	}
}
	


// without the the curly braces the output is
									/*@@@@@
									  $$$$$
									  &&&&&*/

