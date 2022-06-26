package day45_Custom_Classes;

import java.util.ArrayList;
import java.util.Arrays;



public class TestHobby {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("Reading",30,false,false);


        Hobby hobby2 = new Hobby("Travel", 2000,true,true);

        System.out.println(hobby1);
        System.out.println();
        System.out.println(hobby2);

        System.out.println();
        ArrayList<Hobby> Hobbies = new ArrayList<>();
        Hobbies.add(new Hobby("WatchingMovie", 250,false,false));
        Hobbies.add(new Hobby("camping", 200,true,false));


        System.out.println(Hobbies);

        Hobbies.get(0).Doing();
        System.out.println();
        Hobbies.get(1).Doing();

        System.out.println("--------------------------------------------------------1");
        ArrayList<Hobby> copyHobbies = new ArrayList<>(Arrays.asList(hobby1,hobby2));
        copyHobbies.add(Hobbies.get(0));
        copyHobbies.add(Hobbies.get(1));
        System.out.println("-------------DOING--------------");
        copyHobbies.get(0).Doing();
        copyHobbies.get(1).Doing();
        copyHobbies.get(2).Doing();
        copyHobbies.get(3).Doing();

        System.out.println("-----------IsOutDoor------------");
        ArrayList<Hobby> isOutDoor = new ArrayList<>(copyHobbies);
        isOutDoor.removeIf(n -> !n.isOutDoor);
        System.out.println(isOutDoor);

        System.out.println("----------RequireOthers----------");
        isOutDoor.removeIf(n -> !n.requiresOthers);
        System.out.println(isOutDoor);

        System.out.println("----------NoMoreThan$500-----------");
        isOutDoor.addAll(copyHobbies);
        isOutDoor.removeIf(n -> n.annualCost>500);
        System.out.println(isOutDoor);
        System.out.println("-----------ForEach------------------");

        // Calculate the cost of all hobbies where in the ArrayList
        double totalCost = 0;
        for (int i = 0; i < isOutDoor.size(); i++) {
               totalCost += isOutDoor.get(i).annualCost;

        }
        System.out.println(totalCost);



    }
}
