package day55_Polymorphism.interface_methods;

import my_utilities.StringUtil;



public class MacBookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }

}

class Runner {
    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);

//        System.out.println(MacBookPro.NAME);
//        System.out.println(MacBookPro.OS);
      //  Mac.turnOn();  ==> NOT VALID, need an object to call
        /*
        we can access the static variables from the child class reference, but we should use the
        interface to  access
         */
        Mac.company();
//        Mac.faceTime(); This is also instance, we need to object to call it.

        MacBookPro obj = new MacBookPro();
        obj.turnOn(); // turnOn() and faceTime() are instances and can be accessed by the obj.
        obj.faceTime();







    }


}
