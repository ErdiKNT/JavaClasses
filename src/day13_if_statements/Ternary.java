package day13_if_statements;

public class Ternary {
    public static void main(String[] args) {
        String str;
        int score = 59;
        str = (score>70) ?"Nice" : (score>60)  ?"not bad"  : "bad";
        //               if    else           if         else
         System.out.println(str);
    }
}
/*
Syntax:
   resultValuable =boolean_expression ?" . .. " : "..." ;
   ? stands for if
   : stands for else
*/