package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer[] arr ={1, 2, 3}; // We made an Integer array because ArrayList does not accept primitive types.
        Arrays.asList(arr); // converts the array to a collection type (ArrayList)
        ArrayList<Integer> nums =  new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);  //[1, 2, 3]

        //Creating an ArrayList with some initial values

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7));
        System.out.println(other);//[4, 5, 6, 7]











    }

}
