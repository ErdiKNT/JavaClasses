package day42_Custom_Classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {
        App cydeo = new App(); // We made object of the app class.
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;
      //  App.access(); Bu metodu cagirabilmem icin classa gidip bu methodu static yapmaliyim.

        //App.run(); This method calling way is not valid, because it is not a static method.


        cydeo.run();    // Cydeo is running
        cydeo.update(); // Cydeo is updating

        System.out.println(cydeo.name);  // Cydeo
        System.out.println(cydeo.version); // 6.6
        System.out.println(cydeo.isFree); // true
        System.out.println(cydeo); // day42_Custom_Classes.App@6aaa5eb0

        // This creates an object with no reference and calls the run method
        new App().run(); // null is running

        /*
        new Scanner(System.in) bu ifade yeni bir object acar fakat scanner classindan
        bu yeni objemize yukarida cydeo objesine yaptgimiz gibi icinde bulundugu clasin
        metodunu uygulayabiliriz tipki bunun gibi [ new Scanner(System.in).nextLine();]
        Burada nextLine() scanner classi icinde bulunan bir methoddur.
         */
        new Scanner(System.in).nextLine(); // We made new object from scanner class
        Scanner scan = new Scanner(System.in);// We just assigned out new object into 'scan' reference
        String s = scan.nextLine();

        System.out.println(new Scanner(System.in).nextLine());
      //  System.out.println(input.nextLine()); There is no scanner object to use.

    }
}
