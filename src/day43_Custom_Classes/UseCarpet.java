package day43_Custom_Classes;

public class UseCarpet {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(6.2,7.4,true,2.5);
        System.out.println(carpet1); // All coming to a total of $: 314.7

        System.out.println();
        // We can reassign any parameter, then call the calculation method in order to see new price.
        carpet1.length = 14;
        carpet1.calculatePrice();
        System.out.println(carpet1); // All coming to a total of $: 459.0

//    Here, I tried to understand are we able to change static variable data once it is created. And yes, we can reassign static variable later.
//        System.out.println(carpet1.prc);
//        carpet1.prc = 3;
//        System.out.println(carpet1.prc);
    }
}
