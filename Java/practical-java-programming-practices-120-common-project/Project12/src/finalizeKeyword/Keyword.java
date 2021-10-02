/**
 * 
 */
package finalizeKeyword;

/**
 * @author DHREY
 *
 */

class First {
	int x;
	public First(int x) {
		this.x = x;
	}
	protected void finalize() {
		System.out.println("Welcome to Finalize Keyword in Java Programming " + x);	
	}
}

public class Keyword {

	/**
	 * @How to Use Finalize keyword in method
	 */
	
	public static void main(String[] args) throws Throwable {
		
		First f1 = new First(100);
		First f2 = new First(200);
		
		f1 = f2;
		System.gc();
		System.out.println("Hello World");
	}
}
