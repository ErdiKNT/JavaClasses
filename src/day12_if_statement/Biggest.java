package day12_if_statement;

public class Biggest {
    public static void main(String[] args) {
          int a = 8;
          int b = 6;
          int c = 9;
          if(a>b && a>c){
              System.out.println("Maximum num is: " + a);
          }else if(b>a & b>c){
              System.out.println("Maximum num is: " + b);
          }else{
              System.out.println("Maximum num is: " + c);
          }
    }
}
/*
Declare and assign 3 int variables
between the 3 numbers find the print the biggest one
 */