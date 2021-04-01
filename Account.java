package session2;

import java.util.Scanner;

public class Account {
    public static void main(String[] args){
        // declaring the variables
        int accountNumber;
        double accountBalance;

        // Initializing the variables
        System.out.println("Enter the details for the account to be created...");
        System.out.println(("Enter the accounts"));
        Scanner scan = new Scanner(System.in);
        accountNumber = scan.nextInt();
        System.out.println("ENter the account Balance");
        accountBalance = scan.nextDouble();

        System.out.println("the details of the new account are:");
        System.out.printf("the Number: %d", accountNumber);
        System.out.printf("\nAccount Balance: $%.2F", accountBalance);

    }

}
