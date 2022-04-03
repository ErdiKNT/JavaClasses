package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
/*
addAll     (collection Type) : add all the given collection type elements to the ArrayList.
removeAll  (collection type) : remove all the elements that match the given collection type.
containsAll(collection Type) : checks if the ArrayList contains all the defined elements.
retainAll  (collection Type) : keep all matching elements from the argument. The rest of removed.
replaceAll (collection Type) :
 */
public class Caffeine {
    public static void main(String[] args) {
        //This is one option to add elements into ArrayList
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("energy drink");
        drinks.add("soda");
        drinks.add("tea");
        System.out.println(drinks);

        // We copied drinks into drinks2
        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        //We showed how to add array into ArrayList
        String[] allDrinks = {"coffee", "tea", "energy drinks", "soda"};
        //ArrayList<String> drinks3 = new ArrayList<>(allDrinks); This is not valid because the array is not a valid argument.
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        //This is another way to add elements into ArrayList
        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea","soda","energy drink"));
        System.out.println(drinks4);

        //adds all the elements at once. [.addAll Method]
        ArrayList<String> drinks5 = new ArrayList<>();
        drinks5.addAll(Arrays.asList("coffee", "tea","soda","energy drink"));
        System.out.println(drinks5);

























    }
}
