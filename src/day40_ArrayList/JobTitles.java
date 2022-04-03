package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        //ADD ALL
        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer","PO", "CEO", "Dev op", "QA", "BA" , "Chef" ,"Doctor","Police Officer","PO"));

        //REMOVE ALL
        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO", "QA", "BA"));
        System.out.println(jobs1); // [SDET, Developer, CEO, Dev op, Chef, Doctor, Police Officer]

        //RETAIN ALL
        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer","Dev op"));
        System.out.println(jobs2); // [SDET, Developer, Dev op]

        //CONTAINS ALL (Returns boolean)
        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Chef", "CEO")));    // True
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "Nurse")));// False























    }
}
