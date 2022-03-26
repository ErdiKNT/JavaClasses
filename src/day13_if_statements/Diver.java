package day13_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your oxygen level");
        int level = scan.nextInt();
        if(level>90){
            System.out.println("Your tank is full");
        }else if(level>80){
            System.out.println("Still okay");
        }else if(level>70){
            System.out.println("Do not go too far");
        }else if(level>60){
            System.out.println("Start to head back");
        }else if (level>=50){
            System.out.println("Be careful now you are at %50");
        }else{
            System.out.println("Dangerous");
        }
        System.out.println("----------------------------------------------------");

        String message;
        if(level>90){
            message = ("Your tank is full");
        }else if(level>80){
            message = ("Still okay");
        }else if(level>70){
            message = ("Do not go too far");
        }else if(level>60){
            message = ("Start to head back");
        }else if (level>=50){
            message = ("Be careful now you are at %50");
        }else{
            message = ("Dangerous");
        }
        System.out.println(message);





    }
}
/*
create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign an int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at at 50%
 */