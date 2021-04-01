package session2;

import java.util.Scanner;

public class Account2 {
  public static void main(String[] args) {

      double accountBalance = 10000.00;
      double withdraw = 0.00;
      boolean possible = false;
      String name;

      // accept user input and storing it in variables
      System.out.printf("Available account balance: %.2f \n",accountBalance);
      System.out.printf("enter the account to withdraw:");
      Scanner scan = new Scanner(System.in);

      withdraw = Double.parseDouble(scan.nextLine());
      System.out.println("enter the customer name:");
      name = scan.nextLine();

      possible = (accountBalance > withdraw);
      accountBalance = possible ? accountBalance - withdraw: accountBalance;
      System.out.println("welcome" + name);
      System.out.printf("\nCurrent account balance: $%.2f", accountBalance);
      System.out.printf("\nTransaction Successfull:" + possible);

  }



}
