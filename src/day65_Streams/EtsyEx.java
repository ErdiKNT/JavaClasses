package day65_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EtsyEx {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>(Arrays.asList(new Item("Flower Necklace", 18.99, 5),
                new Item("Garden Stone", 19.99, 5),
                new Item("Custom Necklace", 14.00, 5),
                new Item("Gift Box", 43.00, 5),
                new Item("Bracelet", 10.50, 5)

        ));

        // TC: front page should have only 5 star items
        long actual5stars = items.stream().filter(p -> p.getStars() == 5).count();

        if(actual5stars == items.size()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }


        // TC: prices are valid, not 0
        System.out.println(items.stream().noneMatch(p -> p.getPrice() <= 0) ? "PASS" : "FAIL");
    }
}
