package day41_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPair {
    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> list){

        ArrayList<Integer> goodPairs = new ArrayList<>();

        for(int i = 0; i < list.size(); i += 2){
            if(list.get(i) < list.get(i + 1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i + 1));
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));

        System.out.println(removeBadPairs(nums));


    }
}
/*
Create a method that will accept an Integer ArrayList and check for
bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger then
the
second number. Remove any bad pairs for the ArrayList and return
the ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of
elements, so each number always has one pair


Ex:
Input: {3, 4, 6, 1, 1, 10, 8, 7};
Output: {3, 4, 1, 10};
Bad pairs that were removed:
6, 1
8, 7
 */