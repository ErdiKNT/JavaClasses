package day52_inheritance.hiding;

public class CallMethods {
    public static void main(String[] args) {
        A obj = new A();
        obj.instanceMethodA();
        A.staticMethod();


        System.out.println();

        B obj1 = new B();
        obj1.instanceMethodA();
        B.staticMethod();



    }
}
