package day38_ArrayList;



import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("fadime");
        group.add("Erdi");
        group.add("Eren");
        group.add("Aydin");
        group.add("Sude");
        System.out.println(group.get(0)); //fadime
        System.out.println(group.size()); // 5
        System.out.println(group); //  [fadime, Erdi, Eren, Aydin, Sude]
        System.out.println("First student: " + group.get(0));
        System.out.println("Second student: " + group.get(1));
        System.out.println("Third student: " + group.get(2));
        System.out.println("Forth student: " + group.get(3));
        System.out.println("Fifth student: " + group.get(4));

        System.out.println();
        System.out.println("----Traditional----");


        for (int i = 0; i < group.size(); i++) {
            System.out.println("student " + (i + 1) + " " + group.get(i));
        }

        System.out.println();
        System.out.println("----For Each----");

        int num = 1;
        for(String student : group){
            System.out.println("Student "+ num +" "+ student);
            num++;
        }












    }
}
