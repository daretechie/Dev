package trianglePattern;

public class TrianglePatternSecond {
	
	public static void main(String[] args) 
	{
		int x, y, z;
		for(x = 7; x >= 1; x--) 
		{
			for(y = 1; y < x; y++)
			{
				System.out.print(" ");
			}
			for(z = 7; z >= x; z--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


