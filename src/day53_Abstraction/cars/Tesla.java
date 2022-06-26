package day53_Abstraction.cars;
// Tesla is a concrete class.
public class Tesla extends ElectricCar{
    @Override
    public void charge(){
        System.out.println("car in the car");
        System.out.println("Press button");
    }
    @Override
    public void start(){
        System.out.println("charging tesla");
    }
}
/*
We need to call al the implementation that we have from the abstract classes. We have mainly 2 abstract class so, we need to override all methods
that belong to abstract classes.
ElectricCar class is also a subclass of a CAR class that is why we need to override start() method from the CAR class as well.
 */