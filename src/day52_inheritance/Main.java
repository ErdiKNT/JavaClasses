package day52_inheritance;

public class Main {
    public static void main(String[] args) {
        new Parent().walk(); // We called the walk method using object without reference
        new Child().walk();
    }
}

    //This is a default class
    class Parent {
        //final method can not be changed, or overridden
        public final void walk() {
            System.out.println("You are walking");
        }
    }

    class Child extends Parent {

//    @Override
//    public final void walk(){
//
//    }
        // We can not override final methods
    }
