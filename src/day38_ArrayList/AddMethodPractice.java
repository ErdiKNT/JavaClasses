package day38_ArrayList;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class AddMethodPractice {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
          words.add("Hat"); //[Hat]
          words.add("Shoes");//[Hat, Shoes]
          words.add(1,"Jacket");//[Hat, Jacket, Shoes]
          words.add(0,"Towel"); //[Towel, Hat, Jacket, Shoes]
          words.add(1,"Car");
        System.out.println(words); // [Towel, Car, Hat, Jacket, Shoes]
    }
}
/*
Practice flow:
Create an ArrayList of Strings
add these elements:
add Hat
add Shoes
add Jacket in middle of Hat and Shoes
add Towel in the beginning
add Car between Towel and Hat
Print the ArrayList after each action to see how the change is made
 */