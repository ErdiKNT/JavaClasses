package day42_Custom_Classes;

public class App {
    String name;
    double version;
    boolean isFree;
    // Static variables can be used in instance methods, but reverse is not permitted.

    public void run() { // We can not type static, because we can not use instance variables with static method.
        System.out.println(name + " is running");
    }

    public void update() {
        System.out.println(name + " is updating");
        version += 1.1;
    }

    public void access() {
        System.out.println();
    }


}
