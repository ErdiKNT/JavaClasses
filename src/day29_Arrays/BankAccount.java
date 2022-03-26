package day29_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String[] bankAccount = {"Brad Smith", "Checking", "100219482", "100,000,000$"};
        System.out.println(bankAccount.length);
        System.out.println(Arrays.toString(bankAccount));
        System.out.println("Name: " + bankAccount[0]);
        System.out.println("Account type: " + bankAccount[1]);
        System.out.println("Account number: " + bankAccount[2]);
        System.out.println("Balance: " + bankAccount[3]);

        String[] bankAccountTwo = new String[4];
        System.out.println(Arrays.toString(bankAccountTwo)); // We did not determine the elements in the string. (null)
        bankAccountTwo[0] = "Jamie Fox";  // We assigned element 1
        bankAccountTwo[1] = "Savings";    // We assigned
        bankAccountTwo[2] = "130484192";  // We assigned
        bankAccountTwo[3] = "10203324";   // We assigned
        System.out.println(Arrays.toString(bankAccountTwo));

        String [] bankAccountThree = new String[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine(); // We are storing the user input into a variable then assigning it into our array.
        bankAccountThree[0] = firstName;
        System.out.println("Enter your account type");
        bankAccountThree[1] = scan.nextLine(); // We directly made connection between input and array.
        System.out.println("Enter your account number");
        bankAccountThree[2] = scan.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = scan.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        System.out.println("----------------------------------------------");

        String[] bankAccountFour = new String[4];
        String[] Questions = {"Full name", "account type","account number","balance"}; // Every turn in the loop will ask different question.

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + Questions[i]);
               bankAccountFour[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(bankAccountFour));

















    }
}
/*
 0 - full name
 1 - account type
 2 - account number
 3 - balance
 */