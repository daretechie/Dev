package chapter4.Answer.CheckerboardPatternAsterisks;

public class CheckerboardPatternAsterisks {

	public static void main(String[] args) {
	
		CheckerboardPatternAsterisks obj = new CheckerboardPatternAsterisks();
		
		obj.printingCheckboard();

	}
	
	public void printingCheckboard() {
		
		for(int i = 1; i <= 8; i++) {
			//for(int j = 1; j <= 8; j++) {
			 
				System.out.printf("%s* * * * * * * *", ((i % 2 == 0 ? " " : "")));
			//}
			System.out.println();
	}

}
}