package chapter4.Answer.InfiniteLoopOfTwoMultiple;

public class InfiniteLoopOfTwoMultiple {

	public static void main(String[] args) {
		
		InfiniteLoopOfTwoMultiple obj = new InfiniteLoopOfTwoMultiple();
		obj.twoMultiples();
		
	}
	
	public void twoMultiples() {
		int n = 1;
		while(true) {
			n *= 2;
		System.out.println(n);
		}
	}
}