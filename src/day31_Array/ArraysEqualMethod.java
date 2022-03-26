package day31_Array;

import java.util.Arrays;

public class ArraysEqualMethod {
    public static void main(String[] args) {
         String[] arr = {"Erdi", "Fadime", "Betul"};
         String[] arr1 = {"Fadime", "Betul","Erdi"};
         System.out.println(Arrays.equals(arr,arr1)); // False
         System.out.println("--------------------------------");


        int[] a = {1,2,3}; // in the heap memory
        int[] b = {1,2,3};
        int[] c = a;
        System.out.println(a==b); // Compare the a array with the b array, they are different objects.
        System.out.println(Arrays.equals(a,b)); // false

        System.out.println(a==c); // Compares the a array with the c array, they are both reference to the same array object// TRUE

        boolean same = Arrays.equals(a,b); // True. They are the same object.

        int[] d = {3,2,1};
        System.out.println(Arrays.equals(a,d)); // false
    }
}
