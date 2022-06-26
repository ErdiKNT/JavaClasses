package day53_Abstraction.Practice1;

public abstract class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public abstract void hobby();

}
