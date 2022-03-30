package day38_ArrayList;

import java.util.ArrayList;

public class Classroom2 {
    public static void main(String[] args){

        ArrayList<String> group = new ArrayList<>();
        group.add("ziba");
        System.out.println(group); //[ziba]

        group.add(0, "Victor"); //[Victor, ziba].
        System.out.println(group);

        System.out.println(group.get(0)); //Victor
        System.out.println(group.get(1)); // Ziba

        group.add("Ozi");
        System.out.println(group); //[Victor, ziba, Ozi]
        group.add(1,"James"); //James will be added into index 1. The other ones will be shifted.
        System.out.println(group); // [Victor, James, ziba, Ozi]

        System.out.println(group.add("Emre")); // True
        System.out.println(group); //  [Victor, James, ziba, Ozi, Emre]















    }




}
