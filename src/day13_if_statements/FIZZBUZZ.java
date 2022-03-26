package day13_if_statements;


import java.util.Scanner;

public class FIZZBUZZ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        String message;
        if ((number % 3 == 0 && number % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }


    }
}
/*
You will have a number
if the number is divisible by 3 print --> fizz
if the number is divisible by 5 print --> Buzz
if the number is divisible by both 3 and 5 -->FizzBuzz
if the number is not divisible by any of those, print just the number.
 */