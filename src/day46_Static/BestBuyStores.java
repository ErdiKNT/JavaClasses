package day46_Static;

public class BestBuyStores {
    public static void main(String[] args) {
        // access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputer);//100

        BestBuy store1 = new BestBuy("Oak Drive");
        System.out.println(store1.location); // accessing the instance variable
        System.out.println(store1.numberOfComputer); //100

        store1.numberOfComputer--;


        System.out.println(BestBuy.numberOfComputer);// 99
        // Second object is created
        BestBuy store2 = new BestBuy("Main St");
        System.out.println(store2.location);

        store2.numberOfComputer -= 5;

        System.out.println(store1.numberOfComputer); // 94
        System.out.println(BestBuy.numberOfComputer);// 94

        store2.location = "Fairfax";
        System.out.println(store1.location); // Oak Drive
        System.out.println(store2.location); // Fairfax

        BestBuy.reStock(); // static void method called by the ClassName
        System.out.println(BestBuy.numberOfComputer); //114
        store1.reStock(); // static void method called by the objectName
        System.out.println(BestBuy.numberOfComputer); // 134

        //  BestBuy.openStore();
        // OpenStore is not a static method. That is why we can not call it by ClassName
        store1.openStore();
        store2.openStore();


        /*
        We can call static variables or static methods using [object.StaticVariableName] or [className.StaticVariableName]
       1) ClassName
               - static method and static variable can be called. non-static method or non-static variable can not be called using ClassName
       2) objectName
               - static method, static variable and instance variable can be called. non-static method or variable also can be called but ClassName is better.

        */

    }
}
