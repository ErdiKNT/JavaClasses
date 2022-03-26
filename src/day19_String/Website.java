package day19_String;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a url");
        String url = scan.nextLine();

        String website = url.substring(4,url.length()-4);
        System.out.println(website);

    }
}
/*
Task
  ask the user to enter a url
  find the print the website from thr url

  assume your url always starts with www.
  assume your url always ends with .com
  input
        www.google.com
   output
        google
 */