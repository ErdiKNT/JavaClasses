package day32_MultidimensionalArrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
         int[] nums = {4, 10, 30, 100};

        System.out.println(Arrays.binarySearch(nums,4));  //  0
        System.out.println(Arrays.binarySearch(nums,100));//  3
        System.out.println(Arrays.binarySearch(nums,200));// -5  Eger 200 olsaydi index numberi 4 olurdu. buna 1 ve minus ekle -5
        System.out.println(Arrays.binarySearch(nums,6));  // -2 would be in position 1, so 1+1 = 2, and negative because it was not in the array.
        System.out.println(Arrays.binarySearch(nums,25)); // -3 would be in position 2 , so 2+1 = 3, and negative because it is not in the array.
    }
}
