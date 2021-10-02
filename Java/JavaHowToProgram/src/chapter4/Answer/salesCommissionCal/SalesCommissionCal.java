package chapter4.Answer.salesCommissionCal;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

/*
 * 1.	$200 basicWages
 * 2.	9% commission on sale
 * 3.	value of items
 */

public class SalesCommissionCal {
	
	int basicWages;
	double commssion;
	double itemSold; // total value of items sold
	
	
	public SalesCommissionCal(int basicWages, double commssion, double itemSold) {
		
		this.basicWages = basicWages;
		this.commssion = commssion;
		this.itemSold = itemSold;
	}


	public int getBasicWages() {
		return basicWages;
	}

	public double getCommssion() {
		return commssion;
	}

	public double getItemSold() {
		return itemSold;
	}

	public void setItemSold(double itemSold) {
		this.itemSold = itemSold;
	}
	
	
	public void displayMessage() {
		
		System.out.println("\t\tSEMICOLON GROUP OF COMPANY");
		System.out.println("\t\tSALES COMMISSION CALCULATOR\n");
		System.out.println("Please enter corresponding items number sold by the employee for the week or -1 to quit\n");
		System.out.println("Items\t\t Values\n1\t\t $239.99\n2\t\t $129.75\n3\t\t $99.95\n4\t\t $350.89");
	}
	
	public void inputSales() {
		
		Scanner input = new Scanner(System.in);
		
		double item1 = 239.99;
		double item2 = 129.75;
		double item3 = 99.95;
		double item4 = 350.89;
		double totalVal = 0;
		int num = 0;
		while(num != -1) {
			
			System.out.print("Enter corresponding item number 1-4 for items sold: ");
				num = input.nextInt();
			
			switch(num) {
			case 1:
				setItemSold(item1);
				totalVal = totalVal + item1;
				break;
			case 2:
				setItemSold(item2);
				totalVal = totalVal + item2;
				break;
			case 3:
				setItemSold(item3);
				totalVal = totalVal + item3;
				break;
			case 4:
				setItemSold(item4);
				totalVal = totalVal + item4;
				break;
			}
		}
		
		if (num == -1) {
			setItemSold(totalVal);
			System.out.printf("%nTotal Sales: $%.2f",getItemSold());
		}
		input.close();
	}
	
	public void calSalesComm() 
	{
		double commRev = getItemSold() * getCommssion() + basicWages;
		
		System.out.printf("%nSalesperson's Earning: $%.2f",commRev);
		
	}

}

