package day19_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = scan.nextLine().toUpperCase();
        System.out.println("Enter your last name");
        String last = scan.nextLine().toUpperCase();

        System.out.println(""+first.charAt(0) + last.charAt(0));





    }
}
/*
Ask the user to enter their first name
Ask the user to enter their last name
Print the initials
 */