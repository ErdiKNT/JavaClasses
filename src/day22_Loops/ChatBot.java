package day22_Loops;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepTalking = true;

        while (keepTalking) {
            System.out.println("Enter a message");
            String message = scan.nextLine().toLowerCase();
            switch (message) {
                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("I am good");
                    break;
                case "bye":
                    System.out.println("No, don't leave");
                    keepTalking = false;
                    break;
                default:
                    System.out.println("I do not know what you said");

            }


        }
    }
}
