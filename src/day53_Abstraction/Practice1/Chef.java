package day53_Abstraction.Practice1;

public class Chef extends Employee {
    public Chef(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work(){
        System.out.println("Cooking a 3 course meal");
    }

    @Override
    public void hobby(){
        System.out.println("Trying new food");
    }


}
