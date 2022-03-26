package day20_String;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();
        String fixedFirst = firstName.substring(0,1).toUpperCase() +firstName.substring(1);
        String fixedLast  = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(fixedFirst + " " +fixedLast);


    }
}
/*
first name
last name

fix to print proper name:
capital first letter, no extra space, the rest of the letter lowercase
 */