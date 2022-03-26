package day20_String;

public class IndexOfExample {
    public static void main(String[] args) {
        String word = "banana";
                //     012345
        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex); // 1

        int lastIndex =word.lastIndexOf('a');
        System.out.println(lastIndex); // 5

        int secondIndex = word.indexOf('a',firstIndex+1); //Starts to look from index 2
        System.out.println(secondIndex); // 3

        int thirdIndex = word.indexOf('a', secondIndex+1);//Starts to look from index 4
        System.out.println(thirdIndex);  // 5







    }
}
