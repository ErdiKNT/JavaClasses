package day46_Static;

public class AppleStore {
    public static void main(String[] args) {
        //When we make variable in the main method, it is called local variable
        Iphone phone = new Iphone("iphone 10 ", 1000);
        System.out.println(phone);

        Iphone phone2 = new Iphone("iphone 11", 1200); // This line will run the constructor
        System.out.println(phone2);

        // We called static variables by ClassName
        System.out.println(Iphone.company);
        System.out.println(Iphone.os);







    }
}
