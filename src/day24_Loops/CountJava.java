package day24_Loops;

public class CountJava {
    public static void main(String[] args) {
             String str = "java is a java language";
             //            012345
             int count = 0;

        for (int i = 0; i < str.length()-4; i++) {
          String str1 = str.substring(i,i+4);
            if(str1.equals("java")){
                count++;
            }
        }
        System.out.println(count);



    }
}
/*
Java is a language
  count how many times java written
 */