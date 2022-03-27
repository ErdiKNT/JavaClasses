package day37_Wrapper_ArrayList;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2022";
        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year + 1));

        int numYear = Integer.parseInt(year); //Converts string into int.

        System.out.println("This year" + numYear);
        System.out.println("Next year will be " + (numYear + 1));

        System.out.println("---------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String str = scan.nextLine(); // I am x years old.

        String[] agePart = str.split(" ");
        int age = Integer.parseInt(agePart[2]);

        System.out.println("In 5 years, you will be " + (age + 5));




    }
}
