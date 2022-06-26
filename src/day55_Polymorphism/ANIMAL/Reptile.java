package day55_Polymorphism.ANIMAL;

public class Reptile extends Animal {
    int numberOfClaws;


    @Override
    public void eat(){
        System.out.println("Reptile is eating");
    }


}
