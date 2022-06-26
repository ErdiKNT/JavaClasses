package day41_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongWords {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(RemoveLongsWord(word,5));
    }


    public static ArrayList<String> RemoveLongsWord(ArrayList<String> words, int num) {

        words.removeIf(str -> str.length() < num);
        return words;


    }


}
/*
Create a method that will accept an ArrayList of Strings and an int.
Remove any String elements that have less, characters than the given number. Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings
@param int - max number of characters
@return - ArrayList of Strings

Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
Max number: 4
Output: {“three, “four”, “five”
 */