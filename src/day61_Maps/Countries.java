package day61_Maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        // String is an object, ArrayList as well, so we can use ArrayList as well.
        //In this HashMap keys are String and values are ArrayList<String>
        Map<String, ArrayList<String>> countries = new HashMap<>();

        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Houston", "New York", "Denver", "DC", "LA")));
        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto", "Vancouver")));
        System.out.println(countries);

        //Print all cities that start with D or I
        for (ArrayList<String> cities : countries.values()) {//Iterates through the values of the map, which are the ArrayList of cities
            for (String eachCity : cities) {
                if (eachCity.startsWith("D") || eachCity.startsWith("I")) {
                    System.out.println(eachCity);
                }
            }


        }

        System.out.println();
        System.out.println("What country do you want to tour?");
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();

        for (String cities : countries.get(country)){
            System.out.println("Touring..." + cities);
        }

    }
}