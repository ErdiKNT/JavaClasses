package day32_MultidimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] n = {5, 10, 20, 10};
        int[] m = {5, 10, 100, 39, 19};

        int[][] all = {n, m};
        System.out.println(Arrays.toString(all)); // This time it is not going to print out. Hashcode
        System.out.println(Arrays.deepToString(all)); // deepToString method is allowed us to print multidimensionalArray

        System.out.println("First Array: " + Arrays.toString(all[0])); //[5, 10, 20, 10]
        System.out.println("Second Array: " + Arrays.toString(all[1]));//[5, 10, 100, 39, 19]

        int[][] multi = {
                {90, 80, 70},       // index 0 array
                {19, 51, 1129, 12}, // index 1 array
                {10, 1900},         // index 2 array
                {14}                // index 3 array

        };

        System.out.println(multi.length);    // 4
        System.out.println(multi[0].length); // 3
        System.out.println(multi[0][1]);     // 80
        System.out.println(multi[3].length); // 1








    }
}
