package day27_NestedLoops;

import java.util.Scanner;

public class InterviewShape2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your row number");
        int rowNum = scan.nextInt();
        int rowCount = 1;
        System.out.println("Here is your pyramid");

        for (int i = rowNum; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" "); //This is for spaces before the numbers.
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j+" ");


            }
            System.out.println();

            rowCount++;


        }
    }
}
/*
          1
         1 2
        1 2 3
       1 2 3 4
      1 2 3 4 5
     1 2 3 4 5 6
 */