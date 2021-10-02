/**
 * 
 */
package finalKeyword;

/**
 * @author DHREY
 *
 */
/**
 * HOW TO USE final KEYWORD AS A METHOD
 */
public class FinalKeywordForMthd {
	
	final void display() {
		System.out.println("This is a final method.");
	}
}
class Hello extends FinalKeywordForMthd {
	
	public static void main(String[] args) {
		Hello hi = new Hello();
		hi.display();
	}

}
