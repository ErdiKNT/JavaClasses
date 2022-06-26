package day51_inheritance.shape;

public class Square extends Shape {

    double side;


    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override // This will make sure that I typed same method correctly.
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}
