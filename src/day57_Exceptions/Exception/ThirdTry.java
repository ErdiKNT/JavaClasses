package day57_Exceptions.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // What if user enter string instead of number??? Then use try - catch

        try {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println(num);
        }catch (InputMismatchException obj ){

            obj.printStackTrace(); // ==> Shows the exception message in the console.
        }

        System.out.println("Done");
    }
}
/*
Kullanici diyelim numara yerine isim girdi. Bize InputMismatchException verecek. Bu durumda tum uygulamanin crash olmasindansa makul bir sonuc ile calistirabliriz
programi. ===> Try  -  Catch kullanarak.

e.printStackTrace() method exception error mesajini yazdirir fakat uygulamayi durdurmaz. Buna kanit olarak olarak en sonda sout ile "DONE" yazdirdik.
Sadece error mesajini gosterir ama devamindaki kodlari yine yazdirir. Try catch koymazsak hatanin oldugu koddan itibaren dahi program calismayacak.

Try-Catch onemi;
  Uzun bir kodumuz var. Daha ikinci satirda hatamiz var exception veriyor. Bu hata butun kodun calismasini engeller. Kalan kodlar dogru olsa bile. Try-Catch
  ile birlikte hatanin ustu bir sekilde ortulup ondan sonra gelen kodlarinda calismasini saglariz.
 */