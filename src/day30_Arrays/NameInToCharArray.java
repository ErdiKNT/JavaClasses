package day30_Arrays;

import java.util.Scanner;

public class NameInToCharArray {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name");
        String name= scan.nextLine();
        char[]arr=name.toCharArray();

        String result="";

        result= ""+arr[0]+" "+arr[arr.length-1];


        System.out.println(result);

     }

    }




/*
Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
____________________________________________________________

 */