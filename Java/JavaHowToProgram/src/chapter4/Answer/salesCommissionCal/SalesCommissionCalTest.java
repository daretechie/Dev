package chapter4.Answer.salesCommissionCal;

import java.util.Scanner;

public class SalesCommissionCalTest {

	public static void main(String[] args) {
		
		SalesCommissionCal salesCommissionCal = new SalesCommissionCal(200, 0.09, 0);
		
		Scanner input = new Scanner(System.in);
		
		salesCommissionCal.displayMessage();
		salesCommissionCal.inputSales();
		salesCommissionCal.calSalesComm();
		
		input.close();

	}

}
