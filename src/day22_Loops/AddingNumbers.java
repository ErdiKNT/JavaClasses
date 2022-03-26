package day22_Loops;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n2 = 1;
        int n1 = 0;

        while (n2 <= 5) {
            System.out.println("Enter number");
            n1 = n1 + scan.nextInt();
            n2++;

        }
        System.out.println(n1);
    }
}
