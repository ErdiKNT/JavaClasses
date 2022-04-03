package day39_ArrayList;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        String item = list.remove(0);
        System.out.println(item); // computer
        System.out.println(list); // [screen, mouse, keyboard]

        boolean bool = list.remove("mouse");
        System.out.println(bool); // true
        System.out.println(list); // [screen, keyboard]

       // list.remove(2); // This one does not work, because primitive data types does not work with ArrayLists make it object using wrapper
       // System.out.println(list);




    }
}
