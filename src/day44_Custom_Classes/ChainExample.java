package day44_Custom_Classes;

public class ChainExample {

    public ChainExample(){
//        this(4); This is not valid because the chaining contain
        System.out.println("First");
    }

    public ChainExample(int i){
        this(); // Bu ifade yukaridaki constructori cagiriyor, cunku parametre ici bos ayni ikisininde.
        System.out.println("Second");

    }

    public ChainExample(String s){
        this();
        System.out.println("Third");
    }

    public ChainExample(double d){
        this(0); // Line 21 will execute line 11 and line 11 will execute line 7 "First" That is why first, second and fourth will be printed
        System.out.println("Four");
    }


}
