package chapter5.Answer.makingDifference.FacebookUserBaseGrowth;

public class FacebookUserBaseGrowth 
{
	public static void main(String[] args) {
		
		FacebookUserBaseGrowth obj = new FacebookUserBaseGrowth();
		obj.growingUser();
	}
	
	public void growingUser() 
	{
		System.out.println("\t\tFacebook User Grow Prediction program\n".toUpperCase());
		double startValue = 1_000_000_000;
		double rate = 0.04;
		//double growValue;
		double currentUser = 0;
		//growValue = currentUser * rate;
		int month = 0;
		while(month >= 0)
		{
			currentUser = (startValue * Math.pow(1 + rate, month));
			month++;
		
		if(currentUser >= 1_500_000_000) 
		{
			System.out.printf("It will take facebook %d months to attain 1.5 billion that is approximately %.0f users\n", month, currentUser);
			break;
		}
		}
		
		while(month >= 0)
		{
			currentUser = (startValue * Math.pow(1 + rate, month));
			month++;
		
		if(currentUser >= 2_000_000_000) 
		{
			System.out.printf("It will take facebook %d months to attain 1.5 billion that is approximately %.0f users\n", month, currentUser);
			break;
		}
		}	
	}

}
