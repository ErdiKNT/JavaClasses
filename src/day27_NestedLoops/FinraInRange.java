package day27_NestedLoops;

import java.util.Scanner;

public class FinraInRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter stopping point");
        int stop = scan.nextInt();

        for (int i = 0; i <= stop; i++) {

            String str = "";

            if(i % 3 == 0){
                str += "fin";
            }

            if(i % 5 == 0){
                str += "RA";
            }

            System.out.print((str.isEmpty() ? i : str) + " ");

        }










    }
}
/*
similar to fizzbuzz
  number
     % 3 --> fin
     % 5 --> ra
    both --> finra
 neither --> number

 repeated up to some number
 */