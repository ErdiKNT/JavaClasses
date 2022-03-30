package day38_ArrayList;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class RemovePractice {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Iron Man");
        words.add("Spider Man");
        words.add("Thor");
        words.add("Captain America");
        words.add("Hawkeye");
        System.out.println(words); //[Iron Man, Spider Man, Thor, Captain America, Hawkeye]

        words.remove(2); // Removed by index

        System.out.println(words); // [Iron Man, Spider Man, Captain America, Hawkeye]

        words.remove("Iron Man"); // Removed by element

        System.out.println(words); // [Spider Man, Captain America, Hawkeye]

        words.remove(0); // [Captain America, Hawkeye];
        System.out.println(words);// [Captain America, Hawkeye]

    }
}
/*
Create an ArrayList of Strings
add these elements:
Iron Man, Spider Man, Thor, Captain America, Hawkeye
remove Thor by index
remove Iron Man by element
remove the first index
Print the ArrayList after each action to see how the change is made
 */