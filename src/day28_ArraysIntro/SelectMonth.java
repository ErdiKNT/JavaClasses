package day28_ArraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which month number do you want?");
        int monthNum = scan.nextInt();
        String[] months = {"January", "February","March","April","May","June","July","August","September","October","November","December"};
        if(monthNum>=0 && monthNum<=12){
            System.out.println(months[monthNum-1]);
        }else{
            System.out.println("Invalid Number");
        }












    }
}
/*
Ask the user the month number they want, print the month name

 1--> January

 12--> December

 Assume only valid numbers are given, but as a challenge you can handle invalid numbers.
 */