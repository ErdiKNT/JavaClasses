package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,6,9,10,15,20,21,143));

        ArrayList<Integer> nums = new ArrayList<>(base);

        nums.removeIf(n -> n%2==0); // If the elements is divisible by 2, remove them. Burada ArrayList classi icindeki bir metodu cagirdik, bu yuzden
        //sadece variableName.MethodName yazdik. Collections farkli bir class oldugundan once Collections.MethodName(variableName) seklinde yazilir.
        System.out.println(nums); // [9, 15, 21, 143]


        ArrayList<Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf( each -> each >10);
        System.out.println(nums2); //[4, 6, 9, 10] Larger than 10 removed


        ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        days.removeIf(day -> day.startsWith("S") || day.startsWith("T"));
        System.out.println(days); // [Monday, Wednesday, Friday]





    }
}
