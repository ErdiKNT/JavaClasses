package day49_inheritance;
// This is a parent class. Dog is a child class. or (SuperClass-->SubClass)
public class Animal {


    final String str = "kant";
    String species;
    int numberOfLegs;

    public void walk(){
        System.out.println(species + " is walking");
    }

    public final void walk2(){
        System.out.println("Final method can be inherited");
    }


}
