package day33_VoidMethods;

import java.util.Scanner;

/*
make a method that calculates the prints the age
takes the birth year as an input
 */
public class Age {
    public static void calculateAge(int birthYear){
        System.out.println("Age: " + (2022 - birthYear));
    }

    public static void main(String[] args) {
        calculateAge(2000);
        int year = 1990; // We can change variable name, that we previously assigned in the parameter.
        calculateAge(year);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birthday year");
        calculateAge(scan.nextInt());
    }
}
