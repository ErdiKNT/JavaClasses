package day28_ArraysIntro;

import day34_ReturnMethods.NumberWords;

public class AddElements {
    public static void main(String[] args) {

        int [] number = {3, 6, 10};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        System.out.println(sum);



    }
}
/*
Declare and assign an array of numbers

    {3, 6, 10}

    sum all the numbers in the array
 */