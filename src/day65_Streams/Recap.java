package day65_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {

    public static void main(String[] args) {

        /*
           Crate a function that can check if two array are equal and contains the same elements
               Ex: arr1 = {3,2,1}
                   arr2 = {2,1,3}

                   output: true
        */


        //int [] array is already an object. We do not need to use the Integer
        BiPredicate<int[], int[]> arrayIsEqual = (arr1, arr2) -> {

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);


        };


        int[] arr1 = {3, 2, 1};
        int[] arr2 = {2, 1, 3};
        System.out.println(arrayIsEqual.test(arr1, arr2));
        System.out.println(Arrays.toString(arr1));

        /*
        Create a function that can check if the first array contains all the elements of the second array:
        Ex: arr1 = {1,2,3,4,5,6}
            arr2 = {7,8}

            output: False
         */
        BiPredicate<int[], int[]> firstContains = (array1, array2) -> {

            for (int outer : array2) {

                boolean check = false;

                for (int inner : array1) {
                    if (outer == inner) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    return false; // because the number was not in the first array
                }

            }
            return true;
        };

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 1};
        System.out.println(firstContains.test(array1, array2));

        System.out.println();

        // Merge two arrays into a list
        // First two generics are for the parameters
        //  Last generic is for the return type
        // 1,2,3
        // 4,5,6
        BiFunction<int[], int[], List<Integer>> mergeToList = (array3, array4) -> {

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < array3.length; i++) {
                list.add(array3[i]);
                list.add(array4[i]);
            }
            return list;
        };

        int[] arr3 = {1,2,3};
        int[] arr4 = {4,5,6};
        System.out.println(mergeToList.apply(arr3,arr4)); // [1, 4, 2, 5, 3, 6]






























    }


}
