package day31_Array;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String [] allZones = zones.split(","); //String is turned into string array.

        for(String eachZone : allZones){
            System.out.println(app + " is deploying on " + eachZone);
        }

//        for(int i = 0; i < allZones.length; i++){
//            System.out.println(app + " is deploying on " + allZones[i]);
//        }




    }

}
/*

*/