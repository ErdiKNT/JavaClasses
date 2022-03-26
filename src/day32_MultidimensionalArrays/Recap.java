package day32_MultidimensionalArrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int[] arr = {30, 90, 60, 360, 180};
        int[] arr2 = {180, 360, 30, 90, 60};


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Before sorting: "+Arrays.equals(arr,arr2)); // false
        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " + Arrays.equals(arr,arr2));//true

        String[] words = {"hello", "java", "saturday"};
        System.out.println(String.join(" #### ", words));

        String str = "Today is saturday";
        System.out.println(Arrays.toString(str.toCharArray())); // [T, o, d, a, y,  , i, s,  , s, a, t, u, r, d, a, y]
        System.out.println(Arrays.toString(str.split(" "))); // [Today, is, saturday]3ruo





















    }
}
