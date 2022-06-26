package day45_Custom_Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        //Creating an Offer object
        Offer first = new Offer("Google","Texas",200_000, true, 15);

        // Creating an ArrayList that will hold offer objects
        ArrayList<Offer> allOffers = new ArrayList<>();
        //Added the first offer object to the ArrayList
        allOffers.add(new Offer("apple", "Chicago", 220_000, true,20));
        System.out.println();
        System.out.println(allOffers);




       //Created an array of Offer objects
        Offer[] moreOffers = {
             new Offer("Amazon", "Arizona", 230_000,true, 25),
             new Offer("Nasa","Florida",260_000,true,35),
             new Offer("Facebook","Arizona", 120_000,false,10)
        };
       // Added the array of Offers into the ArrayList of Offers
        allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);
        // Added Offer objects using the var args of the asList method to add multiple Offer objects at the same time
        allOffers.addAll(Arrays.asList(
                new Offer("Discord", "Chicago", 150_000,false,13),
                new Offer("Netflix", "Canada", 170_000, true, 12)
        ));

        // Create ArrayLists to filter the Offers

        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        // We did some changes through salary instance variable of the allOffers object
        salaries.removeIf(each -> each.salary < 170_000); // each represents objects or elements of the ArrayList
        System.out.println("Salaries above 170,000");
        System.out.println(salaries);

        System.out.println();
        // We did some changes through isFullTime instance variable of the allOffers object
        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf( each -> !each.isFullTime); // each.isFullTime == false
        System.out.println("Only full time Offers");
        System.out.println(fullTime);
















    }
}
