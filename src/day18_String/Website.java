package day18_String;


import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter URL");
        String url = scan.nextLine().toLowerCase();

        if (url.startsWith("www.")) {
            if (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net")) {

                System.out.println("It is a valid website");

            } else {
                System.out.println("It is not a valid website");
            }

        } else {
            System.out.println("It is not a valid website");
        }


    }
}
/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net

     */
