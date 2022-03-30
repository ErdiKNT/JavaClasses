package day38_ArrayList;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list); // [water, sun, wind, wood]

        list.remove(0);
        System.out.println(list); // [sun, wind, wood]

        list.remove(list.size()-1);
        System.out.println(list); // [sun, wind]

        list.remove("wind");
        System.out.println(list.remove("wind")); // Wind already removed in the previous step, that's why it returns false.
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);

        list.remove("light"); // It will remove the "light" where it is in the last index.
        System.out.println(list);





    }
}
