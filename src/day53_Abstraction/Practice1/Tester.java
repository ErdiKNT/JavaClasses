package day53_Abstraction.Practice1;

public class Tester extends Employee{

    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public  void work(){
        System.out.println("Running test cases");
    }

    @Override
    public  void hobby(){
        System.out.println("Walking in the nature");
    }


}
