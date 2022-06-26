package day53_Abstraction.cars;
// This subclass is a concrete class
// Concrete classes implement all methods from the abstract class
public class Honda extends CAR {
    @Override
    public void start(){
        System.out.println("Pressing button");
    }


    public final String str = "kant";

}
/*
(Concrete Class) ==> first non-abstract class(normal class) that inherits abstract methods
                     The concrete classes must implement all abstract methods
 */