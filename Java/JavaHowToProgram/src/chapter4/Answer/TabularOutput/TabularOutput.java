package chapter4.Answer.TabularOutput;

public class TabularOutput {

	public static void main(String[] args) {
		
		outputtingTabular();
	}
	
	public static void outputtingTabular() {
		System.out.printf("N\t10*N\t100*N\t1000*N%n%n");
		for(int n = 1; n <= 5; n++) {
			System.out.printf("%d\t%d\t%d\t%d%n", n, 10*n, 100*n, 1000*n);
			
		}
		
	}

}
