package day55_Polymorphism.interface_methods;

public interface Mac {

    public static final String NAME = "MAC"; // Public static final variables ==> We typed in UpperCase because it is constant variable
    String OS = "IOS";

    void turnOn(); //==> Public abstract method

    //Q: How do you create a method with implementation in an interface

    // One way is a static method:
    public static void company() {  //==> public is unnecessary
        System.out.println("Apple");
        System.out.println("HQ is LA");
        System.out.println("New Release in Nov");
    }

    //Another way is a default method:

    public default void faceTime() { //==> public is redundant
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }

}
