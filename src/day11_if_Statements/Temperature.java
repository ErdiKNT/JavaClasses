package day11_if_Statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int temperature = scan.nextInt();


        if(temperature>=70){
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        }else{
            System.out.println("Stay in your home");
        }
    }
}
