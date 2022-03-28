package day32_MultidimensionalArrays;

public class PrintingLastChars {
    public static void main(String[] args) {
          String [][] words = {
                  {"James", "is", "back"},
                  {"he", "was", "never", "gone"},
                  {"methods", "tomorrow"}
          };

          for (String[] index : words){
              System.out.println();
              for (String names : index){
                  System.out.print(" "+names.substring(names.length()-1));

              }



          }



    }


}
/*
iven a 2D String array, concatenate the last character of each inner
element on one line, then each following array values in separate lines
Ex:
{"James", "is", "back"}
{"he", "was", "never", "gone"}
{"methods", "tomorrow"}
Output:
ssk
esre
sw



 */