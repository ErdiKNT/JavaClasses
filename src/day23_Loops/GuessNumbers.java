package day23_Loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretNumber = 80;

        int guess;

        do{
            System.out.println("Guess a number from  1 - 100");
            guess = scan.nextInt();

            if(guess>secretNumber){
                System.out.println(guess + "is too high");
            }else if(guess<secretNumber){
                System.out.println(guess + "is too low");
            }


        }while(guess != secretNumber);

        System.out.println("You guessed correct");


    }
}
