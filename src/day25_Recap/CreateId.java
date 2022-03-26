package day25_Recap;

import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine().toLowerCase().trim();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine().toLowerCase().trim();

        String id = "";
        int num = firstName.length() * 2;
        id = firstName.substring(0, 1) + lastName.substring(0, 1).toUpperCase() + lastName.substring(1, 3) + num;
        System.out.println(id);








    }
}
/*
Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
 */