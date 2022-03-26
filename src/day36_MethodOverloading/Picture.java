package day36_MethodOverloading;

public class Picture {
    /*
    We can use same method name with different parameter. But Parameters should be in different order or different number. Because,
    java will confuse which method we want to use.
     */
    public static void draw(){
        System.out.println("trying to draw");
    }

    public static void draw(String color){
        System.out.println("draw with " + color);
    }

    public static void draw(String color, String color2){
        System.out.println("Drawing with color " + color + " and with " + color2);
    }
    // Given parameters does not have to be same data type.
    public static void draw(int length) {
        System.out.println("drawing with size " + length);
    }
    // This is not valid by just changing the parameter name, but if you added two int parameters then it would work.
//    public static void draw(int size){
//        System.out.println("drawing with size " + size);
//    }

    public static void draw(String color, int size){
        System.out.println("First color, then size");
    }
    //We can change the order of parameters
    public static void draw(int size, String color){
        System.out.println("First size, then color");
    }

}
