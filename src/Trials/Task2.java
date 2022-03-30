package Trials;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number");
            System.out.println(sumOfDigits(scan.nextInt()));
    }

    public static int sumOfDigits(int number) {


        int a = number % 10; // 2
        int b = number / 10;   // 93
        int c = b % 10;      // 3
        int d = (b - c) / 10;    // 9
        return a + c + d;


    }
}
/*
 * Q1: (Sum the digits in an integer) Write a program that reads an integer
 * between 0 and 1000 and adds all the digits in the integer. For example, if an
 * integer is 932, the sum of all its digits is 14.
 *
 * NOTE: We will need to solve this without using loops.
 *
 * Hint: Use the % operator to extract digits, and use the / operator to remove
 * the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 * Here is a sample run: Enter a number between 0 and 1000: 999 The sum of the
 * digits is 27
       ------[Solution without Method]------
     *   Scanner scan = new Scanner(System.in);
            System.out.println("Enter number");
            int number = scan.nextInt(); // 932

            int a =  number % 10; // 2
            int b =  number/10;   // 93
            int c =  b % 10;      // 3
            int d =  (b-c)/10;    // 9
            System.out.println(a+c+d);
     *
     *
     *
 */