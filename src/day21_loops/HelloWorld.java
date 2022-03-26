package day21_loops;

public class HelloWorld {
    public static void main(String[] args) {

        int x = 0;
        while (x < 3) { //I could type true, but it does not stop.
            x++;
            System.out.println("Hello World");

        }


    }

}
/*
Flow of above
z = 0
z<3 --> 1 < 3 --> true --> goes into loop
runs code: System.out.println("Hello World"); --> Hello world
z++ --> 2
.
.
.
 */