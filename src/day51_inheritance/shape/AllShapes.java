package day51_inheritance.shape;

public class AllShapes {
    public static void main(String[] args) {
     // SQUARE
        Square obj1 = new Square(4.5);
        System.out.println(obj1);
        System.out.println("Area is: "+obj1.area());
        System.out.println("Perimeter is: "+obj1.perimeter());

        System.out.println("------------------------------");
    // CIRCLE
        Circle obj2 = new Circle(0.5);
        System.out.println(obj2);
        System.out.println("Area is: "+obj2.area());
        System.out.println("Perimeter is: "+obj2.perimeter());
    }
}
