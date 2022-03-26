package day33_VoidMethods;

import java.util.Scanner;

public class Greeting {
    public static void hello(String name){
        System.out.println("hello " + name + " , how are you");
    }

    public static void main(String[] args) {
         hello("James");
         hello("Jamie");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        hello(name);



    }


}
