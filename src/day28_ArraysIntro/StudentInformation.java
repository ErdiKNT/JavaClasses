package day28_ArraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        String[] studentOne = {"007", "Fadime", "Kant", "25"};
        System.out.println(Arrays.toString(studentOne));

        String[] studentTwo = new String[4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo[0] = "010";
        studentTwo[1] = "Erdi";
        studentTwo[2] = "Kant";
        studentTwo[3] = "26";
        System.out.println(Arrays.toString(studentTwo));

//        String[] studentThree = new String[4];
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your ID");
//        studentThree[0] = scan.nextLine();
//        System.out.println("Enter your FirstName");
//        studentThree[1] = scan.nextLine();
//        System.out.println("Enter your lastname");
//        studentThree[2] = scan.nextLine();
//        System.out.println(" Enter your batchNumber");
//        studentThree[3] = scan.nextLine();
//        System.out.println(Arrays.toString(studentThree));


        String [] studentFour = new String[4];
        String [] Questions = {"Enter your ID", "Enter your firstName","Enter your lastName","What is your batch"};

        for (int i = 0; i < 4; i++) {
            System.out.println(Questions[i]);
             studentFour[i] = scan.nextLine();

        }
        System.out.println(Arrays.toString(studentFour));















    }
}
/*
    0=> id
    1-> firstName
    2-> lastName
    3->batchNumber

 */