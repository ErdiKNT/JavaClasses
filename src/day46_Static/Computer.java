package day46_Static;

public class Computer {

    int price;
    String brand;
    String color;




    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    public Computer(int price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;

    }


    static {
        System.out.println("Test Static");
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
        check();
    }

    public static void check(){

        System.out.println("All info are true");
    }


    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references
 */