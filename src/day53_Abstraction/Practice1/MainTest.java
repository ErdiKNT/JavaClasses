package day53_Abstraction.Practice1;

public class MainTest {
    public static void main(String[] args) {
        // We can not create an object from Employee and Person abstract classes
        Chef obj1 = new Chef("Betul", 23, "chef", 90000);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1);
        obj1.hobby();
        obj1.work();

        System.out.println("-----------------------------");

        Tester obj2 = new Tester("Fadime", 26, "SDET", 125000);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2);
        obj2.hobby();
        obj2.work();






    }



}
