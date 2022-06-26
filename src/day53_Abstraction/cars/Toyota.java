package day53_Abstraction.cars;
// We are going to type method from subclass to parent class.
// This subclass is a concrete class
public class Toyota extends CAR {
    @Override
    public void start(){
        System.out.println("Insert the key");
        System.out.println("Turn the key");
    }
}
/*
(Concrete Class) ==> first non-abstract class(normal class) that inherits abstract methods
                     The concrete classes must implement all abstract methods
 */