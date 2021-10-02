/**
 * 
 */
package swapValues;

/**
 * @author DHREY
 *
 */
class SwapFirst {
	
	int num1, num2, a, b;
	
	SwapFirst(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

}

class SwapSecond{
	
	void swap(SwapFirst s) {
		int output = s.num1;
		s.num1 = s.num2;
		s.num2 = output;
	}
}

class callref {
	
	public static void main(String[] args) {
		
		SwapFirst s1 = new SwapFirst(20, 10);
		System.out.println("Before Swaping: " + s1.num1 + "\t" + s1.num2);
		
		SwapSecond s2 = new SwapSecond();
		s2.swap(s1);
		System.out.println("After Swaping: " + s1.num1 + "\t" + s1.num2);
		

	}

}
