package day31_Array;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] number = {5,  20, 9, 11, 2};
        int[] notSorted = number; // if we want to keep original one, even when we put it into another variable it does not work.
        Arrays.sort(number); // This method puts number in order from smallest to largest.This method does not  have a return(nothing to store)
        //Size is fixed but it is mutable.
        System.out.println(Arrays.toString(number));// This one is sorted.
        System.out.println(Arrays.toString(notSorted)); // This one is sorted as well.

        // Q: Max and Min from Array
        System.out.println("Min: " + number[0]);
        System.out.println("Max: " + number[number.length-1]);
        //For interview, to find max number.
        int max = 0;
        for (int i = 0; i < number.length; i++) {
               if(max<number[i]){
                   max=number[i];
               }
        }
        System.out.println("max: " + max);

    }
}
