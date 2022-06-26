package day48_encapsulation;

import day48_encapsulation.Pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza obj = new Pizza("large", 3);
        System.out.println(obj);

      //  obj.numberOfToppings = 2
        obj.setNumberOfToppings(2);
        System.out.println(obj);

        Pizza obj2 = new Pizza("", -2);
        System.out.println(obj2);

        obj2.setSize("small");
        obj2.setNumberOfToppings(-3);
        System.out.println(obj2);

        System.out.println(obj2.getNumberOfToppings());  // -2



    }
}
