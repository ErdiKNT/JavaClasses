package day37_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //Creates empty ArrayList
        System.out.println(numbers);

        //add/assign to an array [index] = value

        numbers.add(100); //adds 100 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-100);//adds -100 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(35);

        // in array how do we access each element: arr[index]
        System.out.println(numbers.get(0)); //100
        System.out.println(numbers.get(1)); //-100
        System.out.println(numbers.get(2)); // 35
        System.out.println(numbers.get(numbers.size() - 1)); // 35

        System.out.println(numbers.size()); // 3

      /*
      Methods:
       1) add(element) ---> adds the element to the end of the ArrayList
       2) remove(index)---> Removes the elements according to index number.
       3) get(index) --->  Returns the element at the given index
       4) size()     --->  Returns how many elements the ArrayList object has
       5) last index ---> VariableName.size() - 1
      */


    }
}
