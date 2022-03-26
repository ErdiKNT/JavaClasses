package day33_VoidMethods;

import java.util.Scanner;

/*
count up to a certain number
start from 0
all the numbers until the number input

method(5) ---> 0 1 2 3 4 5
*/
public class CountNumbers {
    public static void count(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        count(scan.nextInt());
    }

}
