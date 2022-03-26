package day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your pinCOde");
        int pinCode = scan.nextInt();
        System.out.println("Enter your last 4 digit SSN");
        int SSN = scan.nextInt();
        if (pinCode == 1552 && SSN == 1234) {
            System.out.println("Authentication successful");
        } else {
            if (pinCode != 1552 && SSN != 1234) {
                System.out.println("Authentication failed");
            } else if (pinCode != 1552 && SSN == 1234) {
                System.out.println("incorrect pin code");
            } else {
                System.out.println("invalid ssn");
            }


        }


    }
}
/*
inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn

 */