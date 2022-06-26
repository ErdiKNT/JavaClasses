package day48_encapsulation;

public class Rectangle {
    private int length;
    private int width;
    private int Area;
    private int perimeter;

    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
        calculateArea(length,width);
        calculatePerimeter(length,width);
    }

    public void setLength(int length){
        if(length>0){
            this.length = length;
        }
    }

    public void setWidth(int width){
        if(width>0){
            this.width = width;
        }
    }

    public void calculateArea(int length, int width){
         Area = length*width;

    }
    public void calculatePerimeter(int length, int width){
        perimeter = (2*length) + (2*width);

    }

    public String toString(){
        return "Length: " + length + "\n" + "Width: " + width + "\n"+
                "Area: " + Area + "\n" +
                "Perimeter: " + perimeter;


    }

}
