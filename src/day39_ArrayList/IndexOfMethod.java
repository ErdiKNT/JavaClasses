package day39_ArrayList;
import java.util.ArrayList;
public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums.indexOf(100)); // 0
        System.out.println(nums.indexOf(700)); // -1

        int i = nums.indexOf(200);
        System.out.println(i);

        //last 100
        System.out.println(nums.lastIndexOf(100)); // 0

        //middle 100
        nums.remove((Integer) 100); // We need to put Integer here because it gives us error. 100 is primitive data type it does not work with ArrayList
        System.out.println(nums.lastIndexOf(100)); // -1



    }
}
