package superClass;

class FirstSuper
{
	int x, y;
	FirstSuper(int a, int b)
	{
		x = a;
		y = b;
	}
	void show() 
	{
		System.out.println("Value of X: " + x);
		System.out.println("Value of Y: " + y);
		
	}
	
}

class SecondSuper extends FirstSuper
{
	int c;
	SecondSuper(int x, int y, int z) {
		super(x, y);
		c = z;
	}
	void show()
	{
		super.show();
		System.out.println("Value of Z: " + c);
	}
	
}
public class UseSuper {
	public static void main(String[] arg)
	{
		SecondSuper fs = new SecondSuper(100, 200, 300);
		fs.show();
				
	}

}
