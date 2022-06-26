package day46_Static;

import java.util.concurrent.Callable;

public class UseComputer {
    public static void main(String[] args) {
        Computer cmp1 = new Computer(1000, "MSI", "Black");
        // Instance Variables called by object
        System.out.println(cmp1.brand);
        System.out.println(cmp1.price);
        System.out.println(cmp1.color);

        // Static Variables called by class
        System.out.println("Has Battery "+Computer.hasBattery);
        System.out.println("Has Memory"+Computer.hasMemory);
        System.out.println("Has Screen"+Computer.hasScreen);

        // Static Variables called by object, but not good way to call with object.
        System.out.println(cmp1.hasScreen);

        // Static method called by className
        Computer.check();
        System.out.println(cmp1);



















    }






}
