package day32_MultidimensionalArrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String[][] cydeo = new String[4][]; // Second array length is empty because we will declare later.
        System.out.println(Arrays.deepToString(cydeo)); //[null, null, null, null]

        String[] groupOne = {"Emre", "Yasir", "Eda",};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo)); // [[Emre, Yasir, Eda], null, null, null]

        System.out.println("Adding Group 2");
        String[] groupTwo = {"Basri", "Demet", "Shina", "Ismail"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo)); // [[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismail], null, null]

        System.out.println("Adding Group 3");
        String[] groupThird = {"Erdi","Fadime"};
        cydeo[2] = groupThird;
        System.out.println(Arrays.deepToString(cydeo));//[[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismail], [Erdi, Fadime], null]

        System.out.println("Adding Group 4");
        String [] groupFourth = {"eren", "sude"};
        cydeo[3] = groupFourth;
        System.out.println(Arrays.deepToString(cydeo));//[[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismail], [Erdi, Fadime], [eren, sude]]

        System.out.println();
        for ( String[] innerArray  : cydeo) {  // loops through the 2d array, cydeo
              for (String eachWord : innerArray){ // loops through every string element in each 1d array
                  System.out.println(eachWord);
              }
        }











    }
}
