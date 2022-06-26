package day42_Custom_Classes;

public class Rectangle {

    double height;
    double perimeter;
    double area;

    public void calculatePerimeter(double longSide, double shortSide){
        perimeter = (2*longSide) + (2*shortSide);
        System.out.println("perimeter of the rectangle is: "+perimeter);
       // System.out.println(perimeter);
    }

    public void calculateArea(double height, double width){
        area = height * width;
        System.out.println("The area of the rectangle is: " + area);
       // System.out.println(area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
/*
Create a class Rectangle

create instance variables:
    base, height, perimeter, area

create instance methods:

    - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area

    - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width

Create a separate class to create Rectangle objects and test the methods created
 */