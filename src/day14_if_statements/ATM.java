package day14_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Welcome to ATM ***\n Please Enter your card and then type your pincode");
        int pincode = scan.nextInt();

        int expectedPint = 2342;

        if (pincode == expectedPint) {
            System.out.println("Welcome logged In");
            System.out.println("Select a number ");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Withdraw");
            System.out.println("\t3) Deposit");
            int option = scan.nextInt();
            if (option == 1) {
                System.out.println("Your balance is: $100_000");
            } else if (option == 2) {
                System.out.println("How much money would you like to withdraw");
                double wihdraw = scan.nextInt();
                System.out.println("You withdrawed " + wihdraw + "$ amount of money");
            } else if (option == 3) {
                System.out.println("How much money would you like to deposit");
                double deposit = scan.nextInt();
                System.out.println("You deposited" + deposit + "$ amount of money");
            } else {
                System.out.println("Invalid number!!");
            }


        } else {
            System.out.println("Wrong pincode, Please try again");
        }


    }
}
