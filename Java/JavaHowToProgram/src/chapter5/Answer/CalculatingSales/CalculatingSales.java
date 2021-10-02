package chapter5.Answer.CalculatingSales;

import java.util.Scanner;

public class CalculatingSales {
	double itemSold;
	
	public CalculatingSales(double itemSold) 
	{
		this.itemSold = itemSold;
	}

	public double getItemSold() {
		return itemSold;
	}

	public void setItemSold(double itemSold) {
		this.itemSold = itemSold;
	}

	public void displayMessage() 
	{
		System.out.println("\t\tSEMICOLON GROUP OF COMPANY");
		System.out.println("\t\tSALES CALCULATOR\n");
		System.out.println("Please enter corresponding product number sold or -1 to quit\n");
		System.out.println("Product\t\t Values\n1\t\t $2.98\n2\t\t $4.50\n3\t\t $9.98\n4\t\t $4.49\n5\t\t $6.87\n");
	}
	
public void inputSales() {
		
		Scanner input = new Scanner(System.in);
		
		double product1 = 2.98; 
		double product2 = 4.50; 
		double product3 = 9.98; 
		double product4 = 4.49; 
		double product5 = 6.87;
		double totalVal = 0;
		
		int num = 0;
		while(num != -1) 
		{
			System.out.print("Enter corresponding product number 1-4 for items sold or -1 to quit: ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				setItemSold(product1);
				totalVal = totalVal + product1;
				break;
			case 2:
				setItemSold(product2);
				totalVal = totalVal + product2;
				break;
			case 3:
				setItemSold(product3);
				totalVal = totalVal + product3;
				break;
			case 4:
				setItemSold(product4);
				totalVal = totalVal + product4;
				break;
			case 5:
				setItemSold(product5);
				totalVal = totalVal + product5;
				break;
			}
		}
		
		if (num == -1) {
			setItemSold(totalVal);
			System.out.printf("%nTotal Sales: $%.2f",getItemSold());
		}
		input.close();
	}

}
