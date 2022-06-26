package day53_Abstraction.cars;
// Abstract class is a Parent class
/*
Process of hiding implementation(how the method works, actual code) details from the user
Only the functionality will be provided to the user.
User will have the information on what the object does instead of how it does.
 */
public abstract class CAR {

    public abstract void start();
// final variable can be used in abstraction
    public final String str = "kant";

// But final method does not work with abstraction



}
/*
1)Can not be static ==> Because we will override the abstract method to the subclasses. As we know static method can not be overridden.
2)Can not be final  ==> Final can not be changed and overridden, but as we indicated previously,
  once we create an abstract method we will override it into the subclasses and change the implementation in the subclasses.
3)Can not have private access modifier ==> Because, we can not override private access modifier
4)can only be created in an abstract class or in an interface
 */