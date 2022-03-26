package day23_Loops;

import java.util.Scanner;

public class MultiplicationNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int y = x * i;
            System.out.println(x + "*" + i +" =" + y);
        }


    }
}
/*
Declare and assign a number

print all the multiplication results for 1 through 10
 */