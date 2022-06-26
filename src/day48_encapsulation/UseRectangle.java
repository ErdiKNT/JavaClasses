package day48_encapsulation;

import day48_encapsulation.Rectangle;

public class UseRectangle {
    public static void main(String[] args) {
             Rectangle rt1 = new Rectangle(2,5);
        System.out.println(rt1);

        System.out.println();
        rt1.calculateArea(3,4);
        rt1.calculatePerimeter(3,4);
        System.out.println(rt1);

        System.out.println();

        rt1.setLength(5);
        rt1.setWidth(7);
        rt1.calculateArea(5,7);
        System.out.println(rt1);
    }
}
