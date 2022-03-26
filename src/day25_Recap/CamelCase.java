package day25_Recap;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = scan.nextLine().toLowerCase();

        String camelCase = str.substring(0,1);

        for (int i = 1; i < str.length(); i++) {
             if(str.charAt(i-1) == ' '){
                 camelCase += str.substring(i, i+1).toUpperCase();
             }else{
                 camelCase += str.charAt(i); //Today
             }
        }
        System.out.println(camelCase.replace(" ",""));



    }
}
/*
Today is SUNDAY

todayIsSunday

 */