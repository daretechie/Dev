package chapter3.Answer.Account;

import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // display initial balance of each object
      displayAccount(account1);
      displayAccount(account2);

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      displayAccount(account1);
      displayAccount(account2);

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      displayAccount(account1);
      displayAccount(account2);
 
      
      //withdraw
      System.out.print("Enter withdraw amount for account1: "); // prompt
      double withdrawAmount = input.nextDouble(); // obtain user input
      account1.withdraw(withdrawAmount); // subtract from account1's balance

      // display balances
      displayAccount(account1);
      displayAccount(account2);
 

      System.out.print("Enter withdraw amount for account2: "); // prompt
      withdrawAmount = input.nextDouble(); // obtain user input
      account2.withdraw(withdrawAmount); // Subtract from account2 balance

      // display balances
      displayAccount(account1);
      displayAccount(account2);  
      input.close();
      
   } // end main
   
   public static void displayAccount(Account accountToDisplay)
   { 
	   String name = accountToDisplay.getName();
	   double bal = accountToDisplay.getBalance();
	   System.out.printf("%s balance: $%.2f%n", name, bal); 
   }
} // end class AccountTest
