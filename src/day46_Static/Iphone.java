package day46_Static;

public class Iphone {
    // Instance Variables
    String model;
    double price;

    // Static Variables
    static String company;
    static String os;
    static boolean appleDay;
    static String day;
    // Static Block
    static {
        //Static block runs at first time.
        //Static block initialize the static variables
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
        day = "Wednesday";

        if(day.equals("Wednesday")){
            appleDay =true;
        }

    }


    //Constructor
    public Iphone(String model, double price) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override // toString is an instance method, that is why there is no static variables
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
