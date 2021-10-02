package chapter4.Answer.Mystery;

public class Mystery {
	
	public static void main(String[] args) {
		int count = 1;
		
		while (count <= 10) {
			
			System.out.println(count % 2 == 1 ? "****" : "++++++++");
			++count;
		}
	}
} // end class Mystery