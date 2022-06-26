package day54_abstraction.language;
//Implement keyword is used to inherit from interface(s)
/*
public class MyClass implements Interface1, Interface2, Interface3{

}
We can implement multiple interfaces
 */
public interface Language {

   final static String PLANET ="Earth"; // ==> public static final String PLANET
    // These are nothing but public abstract methods
    public abstract void hi();

    void bye();

 //   int a = 100; // static & final by default

 //   void method1();// abstract method by default



}
/*
We are making methods to be organized, later in a subclass.
Instance is about objects, so we can not make instance variables in interface
Variables are static & final by default
Public is the only access modifier that we can use it.
We do not need to type public abstract void hi() ==> public abstract part is redundant.
What interface can have:
  - Static, abstract and default methods only
  - Variables are only static and final by default
What interface can not have:

  -instance variables and methods

 */