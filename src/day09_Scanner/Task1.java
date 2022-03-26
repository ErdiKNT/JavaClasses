package day09_Scanner;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price: ");
        int price = scan.nextInt();
        System.out.println("Enter the quantity: ");
        int quantity = scan.nextInt();
        int revenue = price*quantity;
        System.out.println("Revenue = " + revenue );
    }
}
/*
Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
 */