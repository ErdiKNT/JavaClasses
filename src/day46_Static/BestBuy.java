package day46_Static;

public class BestBuy {
    //Instance Variable
    String location;

    //Static Variable
    static String headquarters = "Richfield, Minnesota, United States";
    static String day = "Wednesday";
    static int numberOfComputer = 100;
    //Constructor
    public BestBuy(String location) {
        this.location = location;
    }
    // Instance Method
    public void openStore(){  // we can use static variable in instance method
        System.out.println("Opening the " + location);

    }
    //Static Method
    public static void reStock(){ // we can not use instance variable into the static method
        numberOfComputer += 20;


    }

}
