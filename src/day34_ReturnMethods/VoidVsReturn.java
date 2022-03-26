package day34_ReturnMethods;

public class VoidVsReturn {
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static String sayBye() { // This is a string return type method.

        return "Bye";

    }


    public static void main(String[] args) {
        sayHello();
        //String msg = sayHello(); This does not work because the method is void.
        sayBye(); // This line is ignored, it does not do anything because we did not use it.
        System.out.println(sayBye());// We need to do something with our return method like printing. Now, we used it.

        String msg = sayBye(); // Also, we can assign out return method into variable then we can type it.
        msg = "" + msg.charAt(0); // We can manipulate our string return.
        System.out.println(msg);
    }

}
