package day47_Encapsulation;

public class computerLab {
    public static void main(String[] args) {

        System.out.println("Hello World");

        ComputerSaim comp = new ComputerSaim("MSI", 500, "Black");

        ComputerSaim.hasBattery = false;

        System.out.println(ComputerSaim.hasBattery);

        // System.out.println(Computer.brand); This is not possible because brand is instance. We need to call it by objectName
        System.out.println(comp.brand);
        // Object is coming from the class we can call static by using objectName but not recommended
        System.out.println(comp.hasMemory);


    }
}
