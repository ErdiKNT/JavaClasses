package day53_Abstraction.cars;

public class GarageMain {
    public static void main(String[] args) {

       // CAR obj = new CAR()==> We can not make object from the abstract class
       // ElectricCar obj4 = new ElectricCar()==> We can not make object from the abstract class

        Toyota obj1 = new Toyota();
        obj1.start();

        Honda obj2 = new Honda();
        obj2.start();
        System.out.println(obj2.str);

        System.out.println(obj2.str);
        // Both Toyota and Honda concrete classes, simply because they are not abstract classes

        Tesla obj3 = new Tesla();
        obj3.charge();//--> Defined in the ElectricCar class
        obj3.start(); //--> Defined in the CAR class

        // Tesla class is also a concrete class.







    }
}
