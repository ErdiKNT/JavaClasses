package day50_Inheritance.computer;

public class Lab {

    public static void main(String[] args) {


        Computer obj1 = new Computer("generic os" , 300);
        System.out.println(obj1);

        windows obj2 = new windows(64);
      //               new Computer
      // (Windows , 500)
        System.out.println(obj2);

        // obj3`te devamli farkli mac pc obj kursak devamli "Mac" yazmamiz gerekir, bundan kacinmak icin Mac clasinda actigimiz constructorin icine bir defa
        // Mac yazmamiz yeterli. Tipki windowsta yaptigimiz gibi.
        Mac obj3 = new Mac("Mac", 64);
        System.out.println(obj3);

     /*
        Object ----> aslinda butun actigimiz classlar child class. Hepsinin parent classi Object classtir. ve biz bir class actigimizda
        default olarak extend (inheritance) olur. Object classindan bir cok sey kullanmis oluruz.
      */

        


    }



}
