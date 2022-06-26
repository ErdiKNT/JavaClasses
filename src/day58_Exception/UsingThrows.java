package day58_Exception;

public class UsingThrows {
    public static void main(String[] args) throws InterruptedException { // We ignore the exception by typing this line. But we put - value, once we run it will throw exception, program does not run


        Thread.sleep(-3000);//

        Person obj = new Person();
        obj.setAge(130);
        System.out.println(obj);



    }
}
