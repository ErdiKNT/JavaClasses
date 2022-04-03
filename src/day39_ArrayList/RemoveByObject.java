package day39_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums); //[200, 500, 800]

        Integer i = 500; // Eger element string olsaydi yazarak kaldirabiliriz cunku string non-primitive, fakat sayilar primitive,
        // o yuzden wrapper class kullanmadan kaldiramayiz. Wrapper ile objecte cevirmeliyiz.
        // nums.remove(500); //This will go out of bonds because 500 is read as an int number, and that is not a valid index.
        nums.remove(i);
        System.out.println(nums); // [200, 800]

        nums.remove(Integer.valueOf(200));//[800]
        System.out.println(nums);

        nums.remove((Integer)800);
        System.out.println(nums); // []


    }
}
