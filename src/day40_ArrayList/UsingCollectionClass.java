package day40_ArrayList;
  /*
        There is no sort method in ArrayList
        ArrayListObject.sort() is not valid
        We call Collection class which has a sort method.
        Collection bir classdir ve icinde farkli metodlar bulunur, bu metodlari ArrayListler icin kullanabiliriz. Bu tipki bizim void metod, return metod gibi
        metodlar acip (Bir class icinde) daha sonra onlari cagirmamiza benziyor, hatta aynisi. Birisi class acmis adi Collections ve orada metodlar var.
        Metod cagirma yontemi icin onceden classin adini yazip '.' koyup daha sonra methodun adini yazardik. Buda aynisi. Mesela bizde ArrayUtility ve String
        Utility classi actik icinede bir dizi kullanisli metodlar yazdik.Bu metodlari class adini ve daha sonra ise metod adini yazip cagirabilir ve kullanabiliriz.

         */
import my_utilities.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class UsingCollectionClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,4,50,35,42,10,65,77,90));

        //Arrays.sort(list); We can not use this method to sort the numbers as we do in arrays. This is ArrayList.

        //SORT METHOD
        Collections.sort(list); // For the arrayList we use Collections.sort in order to sort numbers.
        System.out.println(list); // [3, 4, 10, 35, 42, 50, 65, 77, 90]

        //REVERSE METHOD
        Collections.reverse(list);
        System.out.println(list);  // [90, 77, 65, 50, 42, 35, 10, 4, 3]

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
        Collections.sort(letters);
        System.out.println(letters); // [A, B, C, D, E, F, G, H]

        Collections.reverse(letters);
        System.out.println(letters); // [H, G, F, E, D, C, B, A]

        //MAX AND MIN METHOD
        System.out.println(Collections.max(list)); // 90  Buna benzer kodu biz ArrayUtilityde yazdik metoduyla birlikte onuda cagirip kullanabiliriz, maksimum
        // sayiyi bulmak icin.
        System.out.println(Collections.min(list));// 3

        //SWAP METHOD
        Collections.swap(letters, 0,3);
        System.out.println(letters);  // [E, G, F, H, D, C, B, A]


        //Frequency Method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 20, 11, 20, 30));
        System.out.println( Collections.frequency(numbers, 11)); // 3 times repeated.

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "one"));
        System.out.println(Collections.frequency(words, "one")); // 2 times repeated.

        //SHUFFLE METHOD
        Collections.shuffle(words);
        System.out.println(words); //[one, three, four, one, two]











    }
}
