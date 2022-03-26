package day29_Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};
          int[] reverse = new int[arr.length];

        for (int i = arr.length-1, j=0; i >=0 ; i--,j++) {
            reverse[j] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));

    }
}
 /*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
 */