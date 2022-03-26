package day30_Arrays;

import java.util.Arrays;

public class MultipleWords {

    public static void main(String[] args) {
        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washerâ" ;


        String[]arr=str.split(",");

        String result="";
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].trim().contains(" ")){
                result+=arr[i]+"\n";

            }

        }
        System.out.println(result);






    }
}

/*
Multiple Words
Given a String of words that are separate by commas. Find and print any
words that have more than one word
Example
Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash
can, fridge, dish washerâ
Output:
wooden spoons
trash can
dish washer


 */
