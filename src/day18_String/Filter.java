package day18_String;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = scan.nextLine().toLowerCase().trim(); // We can use all of them at once.


        if (message.contains("java is bad") || message.contains("quit") || message.contains("crying") || message.contains("have fun")) {

            System.out.println("Message failed to send");


        }else {
            System.out.println("Message sent");
        }


    }
}
/*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
     */
