package day41_ArrayListPractice;

import day40_ArrayList.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {

    public static ArrayList<String> reverseAll(ArrayList<String> list){

        ArrayList<String> reverseWords = new ArrayList<>();

        for(String each : list){

            reverseWords.add(StringUtil.reverse(each));
            // We call the reverse method in StringUtil class to reverse each word, each element, then we are adding the reversed word into the 'reverseWords' ArrayList
        }

        return reverseWords;

    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println(reverseAll(list));

        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));

    }

}
