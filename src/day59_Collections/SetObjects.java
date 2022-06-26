package day59_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {
      // Basically we are doing polymorphic reference
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
//      set.add("hello"); we can not use duplicate
        set.add("%");
        System.out.println(set); // Order of the elements will be random. But everytime we run it order does not change. There is no index in HashSet
        // We can do loop to interact with the every element. [null, 400, %, $4.5, hello]

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
//      set2.add("hello"); we can not use duplicate again. We can not duplicate in hast type.
        set2.add("%");
        System.out.println(set2); //  [null, hello, $4.5, 400, %] The order will be same as we add.

        Set<String> set3 = new TreeSet<>();
//        set3.add(null); This will throw nullPointerException
        set3.add("hello");
        set3.add("$4.5");
        set3.add("400");
//      set2.add("hello"); we can not use duplicate again. We can not duplicate in hast type.
        set3.add("%");
        set3.add("WORLD");
        System.out.println(set3); // [$4.5, %, 400, WORLD, hello] In this line, will be printed according to ASCII.


    }
}
/*


























 */