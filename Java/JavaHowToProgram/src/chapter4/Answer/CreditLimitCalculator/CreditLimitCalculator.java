package chapter4.Answer.CreditLimitCalculator;

import java.util.Scanner;

/**
 * 
 * @author DHREY
 *
 */

public class CreditLimitCalculator {
	
	int acctNum;		//account number
	int beginBal;		//balance at the beginning of the month
	int totalCharged;	//total of all items charged
	int totalCredit;	//total of all credits applied
	int creditLimit;	//allowed credit limit
	
	
	public CreditLimitCalculator(int acctNum, int beginBal, int totalCharged, int totalCredit, int creditLimit) {
	
		this.acctNum = acctNum;
		this.beginBal = beginBal;
		this.totalCharged = totalCharged;
		this.totalCredit = totalCredit;
		this.creditLimit = creditLimit;
	}


	public int getAcctNum() {
		return acctNum;
	}


	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}


	public int getBeginBal() {
		return beginBal;
	}


	public void setBeginBal(int beginBal) {
		this.beginBal = beginBal;
	}


	public int getTotalCharged() {
		return totalCharged;
	}


	public void setTotalCharged(int totalCharged) {
		this.totalCharged = totalCharged;
	}


	public int getTotalCredit() {
		return totalCredit;
	}


	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}


	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	public void displayMessage() {
		
		System.out.println("\t\tCREDIT LIMIT CALCULATOR");
		System.out.println("Please, enter all your details as requested to calculate the credit limit of the customer\n");
	}
	
	public void customerInput() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter customer account number: ");
		setAcctNum(input.nextInt());
		
		System.out.print("Enter balance at the beginning of the month: ");
		setBeginBal(input.nextInt());
		
		System.out.print("Enter total of all items charged by the customer: ");
		setTotalCharged(input.nextInt());
		
		System.out.print("Enter total of all credits applied to the customer’s account: ");
		setTotalCredit(input.nextInt());
		
		System.out.print("Enter allowed credit limit: ");
		setCreditLimit(input.nextInt());
		input.close();
	}
	
	public int calNewBalance() {
		return getBeginBal() - getTotalCharged() + getTotalCredit();
	}
		
	public boolean isCreditExceeded() {
		return (calNewBalance() > getCreditLimit()) ? false : true;
	}
	
	public void displayMsg() {
		System.out.println("\t\n**********************");
		System.out.printf("%n%s: %d%n%s: $%d%n%s: $%d%n%s: $%d%n%s: $%d%n%s: $%d%n",
				"Account Number",getAcctNum(),"Beginning Balance",getBeginBal(),"Credit Limit Allowed",getCreditLimit(),"Total Items Charged",
				getTotalCharged(), "Total Credit Applied", getTotalCredit(), "New Balance",calNewBalance());
		
		if(isCreditExceeded()) {
			System.out.println("Credit limit exceeded.");
		}
		else {
			System.out.println("Balance exceeded");
		}
	
	}
}