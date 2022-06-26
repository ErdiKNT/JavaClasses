package day55_Polymorphism.shopping;

public interface ConsumerApp extends Shipping, AllowUserToSell{
  /*
We are just making grouping interfaces using extends keyword. interfaceleride kendi aralarinda inheritance yani extends yapabiliriz, Burada bunu yaptik.
Iki tane ayri interfacei alip tek bir interfacede topladik.
 */

}

abstract class TestA implements Shipping, AllowUserToSell{
    /*
    Burada ayri ayri implement yapacagimiza, Tek bir interface acip orda
    onlari group yapip, sadece onu implements yapabiliriz.
     */
}

abstract class TestB implements ConsumerApp{

}