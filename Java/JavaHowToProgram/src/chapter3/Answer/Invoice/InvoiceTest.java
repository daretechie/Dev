package chapter3.Answer.Invoice;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		System.out.println("SEMICOLON HARDWARE SOLUTION STORE\n");
		
		Invoice invoice1 = new Invoice("", "", 0, 0.0);
		
		//to take input
		Scanner input = new Scanner(System.in);
		
		//take part number
		System.out.println("Enter part number: ");
		String partNumber = input.nextLine();
		invoice1.setPartNumber(partNumber);
		
		//collect part description
		System.out.println("Enter part Description: ");
		String partDescription = input.nextLine();
		invoice1.setPartDecription(partDescription);
		
		//collect quantity purchased
		System.out.println("Enter quantity of part purchased: ");
		int quantityPurchased = input.nextInt();
		invoice1.setQuantityPurchased(quantityPurchased);
		
		//collect price per part
		System.out.println("Enter price per part: ");
		double pricePerPart = input.nextDouble();
		invoice1.setPricePerPart(pricePerPart);
		
		input.close();
		
		System.out.println("\n\t\tINVOICE\n");
		
		System.out.println("" + invoice1.getPartNumber());
		System.out.println("" + invoice1.getPartDecription());
		System.out.printf("Quantity: %d%n", invoice1.getQuantityPurchased());
		System.out.printf("Price per quantity: $%.2f%n", invoice1.getPricePerPart());
		
		
		System.out.printf("Total price: $%.2f", invoice1.getInvoicceAmount());
		
		
		

	}

}
