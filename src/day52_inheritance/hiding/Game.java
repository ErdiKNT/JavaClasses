package day52_inheritance.hiding;

public class Game {
    public static void main(String[] args){
        //Once we put the same cheer method in the subclass, the method where is in the parent class will be hidden
        // After this point, when we call cheer() method with the subclass, it will call it from the subclass not from the parent class
        // Static methods can not be overridden, in this case it is looks like overridden, but it is not, it is hiding.
        Sports.cheer();//---> Calling the cheer method from the Sport class
        System.out.println();
        Soccer.cheer();//---> Calling the cheer method from the Soccer class












    }

}
