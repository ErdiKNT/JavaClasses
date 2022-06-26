package day43_Custom_Classes;

public class UseTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Green");
        //                       this is constructor

        System.out.println(light.color);//Green


        TrafficLight light2 = new TrafficLight("Red");
        System.out.println(light2.color); //Red

        light2.color = "yellow";
        System.out.println(light2);//day43_Custom_Classes.TrafficLight@1d251891
    }
}
