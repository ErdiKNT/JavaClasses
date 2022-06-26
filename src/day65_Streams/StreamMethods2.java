package day65_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {

        // Map method: Change every element from the stream, based on a lambda expression

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> byTwo = list.stream().map(e -> e * 2).collect(Collectors.toList());  // Multiply each element by two

        System.out.println(list);
        System.out.println(byTwo);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        List<String> abr = days.stream().map(day -> day.substring(0, 3)).collect(Collectors.toList());
        System.out.println(days);
        System.out.println(abr); // [Mon, Tue, Wed, Thu, Fri, Sat, Sun]

        System.out.println();

        // Filter(): Allows us the filter certain elements.
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evens = list2.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        List<Integer> odds = list2.stream().filter(p -> p % 2 == 1).collect(Collectors.toList());
        System.out.println(evens); // [2, 4, 6, 8, 10]
        System.out.println(odds);  // [1, 3, 5, 7, 9]
        System.out.println(list2); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(list2.stream().filter(p -> p % 2 == 0).count());
        System.out.println(list2.stream().filter(p -> p % 2 == 0).distinct().count()); // Finding how many unique even numbers there are

        System.out.println();

        List<String> strs = new ArrayList<>(Arrays.asList("java", "javascript", "selenium", "cypress", "jAVa", "hello world", "JAVA"));
        long java = strs.stream().filter(p -> {
            p = p.toLowerCase();
            return p.contains("java");

        }).count();
        System.out.println(java); // 4
        System.out.println(strs.stream().filter(p ->  p.toLowerCase().contains("java")).collect(Collectors.toList())); // [java, javascript, jAVa, JAVA]

        System.out.println();

        // forEach
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 4));
        list3.stream().filter(p -> p % 2 == 0).forEach(p -> System.out.println(p)); // The p where is in the filter and forEach are separate from each other, they are separate arguments.
        list3.stream().filter(p -> p % 2 == 0).forEach(System.out::println);

        /*
           .stream() creating a stream from my arrayList
           .filter() only keeping all the even numbers in stream
           .forEach() do an action based on the lambda expression
         */


        List<Integer> list4 = new ArrayList<>(Arrays.asList(5, 10, 20, 25, 15));
        System.out.println("Divisible by 5: " + list4.stream().allMatch(p -> p % 5 == 0)); // True
        System.out.println("Even: " + list4.stream().allMatch(p -> p % 2 == 0)); //           False
        System.out.println("More Than 30: " + list4.stream().anyMatch(p -> p >30)); //        False
        System.out.println("More Than 20: " + list4.stream().anyMatch(p -> p >20)); //        True
        System.out.println("None are above 30: " + list4.stream().noneMatch(p -> p >30)); //  True

























    }
}
