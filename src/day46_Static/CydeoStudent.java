package day46_Static;

import java.util.Arrays;

public class CydeoStudent {
    // We need an object in order to use instance variables
    // public sayesinde baska bir packagedan cagirabiliyoruz, public koymazsak cagiramayiz.
   public String name;
   public int groupNumber;


    //static variables belongs to class does not need object.
    public static int batchNumber;
    public static String[] instructors;
    public static String schoolName;

    // We can assign and declare at the same time, but it is not recommended, we will use static block to assign.
    static {
        batchNumber = 26;
        instructors = new String[]{"Saim", "Nadir", "Mehmet", "Austin", "Aysun"};
        schoolName = "Cydeo";
        printInfo();
    }

    // Constructor
    public CydeoStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public  static void printInfo(){
        System.out.println("School Name " + schoolName);
        System.out.println("Batch Number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
