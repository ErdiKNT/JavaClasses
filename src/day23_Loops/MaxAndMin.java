package day23_Loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int attempt =0;
        int max = 0;
        int min = 100000;

        while(attempt<5){
            System.out.println("Enter your number");
            int n = scan.nextInt();
            attempt++;
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }

        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + min);






    }
}
/*
write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
 */