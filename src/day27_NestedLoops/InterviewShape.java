package day27_NestedLoops;

import java.util.Scanner;

public class InterviewShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = scan.nextInt();
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing 'rowCount' value 'rowCount' times at the end of each row

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;

        }
    }
    }

/*
          1
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5
     6 6 6 6 6 6
*/
