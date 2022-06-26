package day47_Encapsulation;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red");

        // System.out.println(light.color); //light color seklinde yazdik cunku toString metodu yazmadik.
        // someone came in this class and change the color like this;
        //  light.color = "pink"; -----> This is not possible, anymore because it is a private instance variable

        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.getColor()); // RED

        light2.setColor("grey");
        System.out.println(light2.getColor()); // RED

        TrafficLight light3 = new TrafficLight("Black");
        System.out.println(light3.getColor()); // BLACK




    }
}
