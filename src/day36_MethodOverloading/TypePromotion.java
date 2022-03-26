package day36_MethodOverloading;

public class TypePromotion {

    public static void main(String[] args) {
       use(3);
       use(3.1);
       use(3f);
       use(3L);
    }

    public static void use(float f){
        System.out.println("Calling float method");
    }

    public static void use(double d){
        System.out.println("Calling double method");
    }

    public static void use(long l){
        System.out.println("Calling long method");
    }

}
