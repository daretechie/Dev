/**
 * 
 */
package thisKeyword;

/**
 * @author DHREY
 *
 */
public class UseThis 
{
	int num1, num2;
	UseThis(int num1, int num2) 
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void show()
	{
		System.out.println("Value of Num1 is: " + num1);
		System.out.println("Value of Num2 is: " + num2);
	}

	/**
	 * @How to use this keyword in java
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		UseThis ut = new UseThis(100, 200);
		ut.show();
		
	}

}
