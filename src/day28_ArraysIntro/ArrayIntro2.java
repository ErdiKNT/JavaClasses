package day28_ArraysIntro;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        double[] arr = new double[4];
        System.out.println(Arrays.toString(arr)); //Gives us default value for double type

        arr[0] = 30.99;
        arr[1] = 12.55;
        arr[2] = 23.56;
        arr[3] = 25.46;
        System.out.println(Arrays.toString(arr));

        //Reassigning
        arr[2] = 2000;
        System.out.println(Arrays.toString(arr));

        arr = new double[5]; //We can never change size, we have to declare another array with 5 elements.



    }
}
