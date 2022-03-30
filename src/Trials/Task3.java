package Trials;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your amount");
        double amount = scan.nextDouble();

        double cents = (amount*100) % 10; //6 ---> Cents
        double quarters = (((amount*100) % 100)-cents)/25; // 50 ---> 2 Quarters








    }
}

/*
     * ComputeChange/63
     *
     * Enter an amount, for example: 11.56 Your amount 11.56 consists of 11 dollars
     * 2 quarters 0 dimes 1 nickels 1 cent
     */
