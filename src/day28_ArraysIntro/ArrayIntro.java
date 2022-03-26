package day28_ArraysIntro;

import java.util.Arrays;  // This method calls arrays
import java.util.Scanner; //This method calls scanner

public class ArrayIntro {
    public static void main(String[] args) {
        //With normal variables

        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFOur = "Denver";
        String cityFive = "Pittsburgh";

        //Declare array with values

        String[] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh"}; //We know the values so, we can use this form of arrays.

        System.out.println(Arrays.toString(cities)); //This method is required in order to print out "cities"
        System.out.println(cities[2]);

        //How to access each element in the array.

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        System.out.println("Reverse order of the cities: " +cities[4]+ ","+ cities[3]+","+cities[2]+","+cities[1]+","+cities[0]);

        //Print the array all at one time
        System.out.println(Arrays.toString(cities)); //This method from arrays class lets you print the array fully.

        //Number of elements
        System.out.println(cities.length); //length is for arrays but length() is for strings.

        //2nd way to use for arrays
        int[] nums = new int[5]; // The number 5 is nothing but room for the elements which is not declared yet.
        nums[0]=1;  // We declared one number for index 0.
        System.out.println(nums[0]);


























    }
}
