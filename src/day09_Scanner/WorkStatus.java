package day09_Scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// In this line saim type input instead of scan. Then he used input.next().!!!!
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
        System.out.println("Are you employed");
        boolean isEmployed = input.nextBoolean();
        System.out.println("Are you a student");
        boolean isStudent = input.nextBoolean();

        String details = firstName + " " + lastName + " is employed: " + isEmployed + " and they are a student: " + isStudent;

        System.out.println(details);
    }
}

/*
        Task
        create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean
     */
