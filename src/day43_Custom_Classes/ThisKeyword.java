package day43_Custom_Classes;

public class ThisKeyword {

    int a; // instance variable

    public ThisKeyword(int a){

        a = 400; // Local variable
        System.out.println(a); // local variable will be print
        this.a = 500; //this keyword is priorities the instance variable. We use 'this' keyword to say java we want to use instance variable

    }



}
