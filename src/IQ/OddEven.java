package IQ;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println(EvenOrOdd(x));

    }


    public static String EvenOrOdd (int x){

        if (x % 2 == 0) {
            return x + " is an even number";
        }else{
            return x + " is an odd number";
        }

    }





}
/*
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */