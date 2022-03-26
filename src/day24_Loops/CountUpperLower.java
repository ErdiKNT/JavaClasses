package day24_Loops;

public class CountUpperLower {
    public static void main(String[] args) {
        String str = "erdikantFADIMEKANT1234";
        int upperCase =0;
        int lowerCase =0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                 upperCase++;
             }else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                 lowerCase++;
             }else{
                 number++;
             }
        }
        System.out.println("Number of upperCase "+upperCase);
        System.out.println("Number of lowerCase "+lowerCase);
        System.out.println(number + "number");









    }
}
/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase
letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */