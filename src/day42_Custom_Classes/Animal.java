package day42_Custom_Classes;

public class Animal {

    String species;
    long population;

    public String toString(){
        String print = "Species: " + species;
        print += "\nPopulation: " + population;
        return print;  //We do not need to type all the instance variables one by one. Now, We can print all of them at once.
        // We made a group from instance variables in order to call all of them.
    }



}
