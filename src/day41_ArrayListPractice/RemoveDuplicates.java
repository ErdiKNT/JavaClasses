package day41_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class RemoveDuplicates {
    public static void main(String[] args) {
          ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,3,5,1,4,5,9,9));
        System.out.println(removeDuplicates(num1));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers) {

        numbers.removeIf(num -> Collections.frequency(numbers, num) > 1);
        return numbers;
    }
}
/*
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers

Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
 */