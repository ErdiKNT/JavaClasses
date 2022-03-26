package day28_ArraysIntro;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Which item you are looking for?");
        String itemName=scan.next();

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad"};
         boolean hasJaket=false;
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase(itemName)){
                hasJaket=true;
                break;
            }

        }
        System.out.println(hasJaket?"item in stock" : "item out of stock");














    }
}
/*
Do we have jackets in stock?

Use Scanner to ask which item they are looking for ,and check if we have it
 */