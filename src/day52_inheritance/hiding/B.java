package day52_inheritance.hiding;

public class B extends A {
    @Override
    public void instanceMethodA() {
        staticMethod();
    }

//    @Override --> We can not override static method, but we can declare this method and the staticMethod from the parent class will become hidden
    public static void staticMethod(){
        System.out.println("Static method from class CHILD class");

    }

   // @Override --> We can not also call, static variable, but we can hide them just we did with the method
    static String name = "Erdi";

}
