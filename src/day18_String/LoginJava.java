package day18_String;

import java.util.Scanner;

public class LoginJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username");
        String username = input.next();
        username = username.toLowerCase();

        System.out.println("Please enter a password");
        String password = input.next();

        if(password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + username);
        } else {
            System.out.println("Invalid password");
        }
    }
}
