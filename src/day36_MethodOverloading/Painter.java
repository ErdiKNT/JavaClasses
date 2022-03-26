package day36_MethodOverloading;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(100); //int
        Picture.draw("blue"); // String
        Picture.draw("blue","red");// String, String

        String s = "200";
        Picture.draw(s); // line 7 will work here.
        //The order of parameters are different, java will not confuse them.
        Picture.draw(300, "blue");
        Picture.draw("blue",200);
    }
}
