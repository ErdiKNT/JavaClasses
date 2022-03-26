package day22_Loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to atm");
        int pin;
        int validPin = 1234;
        int attempts = 0;
        do {
            System.out.println("Enter your pin");
             pin = scan.nextInt();
             attempts++;
        }while(validPin != pin && attempts<3);

       if(validPin == pin){
           System.out.println("Logged In");
       }else{
           System.out.println("Your account is blocked");
       }

    }
}
