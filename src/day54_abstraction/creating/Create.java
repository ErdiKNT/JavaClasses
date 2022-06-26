package day54_abstraction.creating;
//interface is not a class.
public interface Create {


    public abstract void read();


    void write(); // any method made in the interface is public abstract, we can delete public abstract part


}
/*
in interface, we type methods just like we did in abstract class
We can not make object from the interface. We can not make a constructor as well, because it is not a class.
So, the purpose of the interface is defining a method without an implementation(code).
This is nothing, but also another way to do abstraction
 */