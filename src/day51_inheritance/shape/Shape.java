package day51_inheritance.shape;

import java.lang.annotation.Inherited;

public class Shape {

    String name;
    // Constructor
    public Shape(String name){
        this.name = name;
    }
    // return double instance method --> area
    public double area(){
        return 0.0;
    }
    //return double instance method --> perimeter
    public double perimeter(){
        return 0.0;
    }
    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }

}
