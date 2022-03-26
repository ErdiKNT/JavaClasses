package day36_MethodOverloading;

public class OverloadAndReturn {
    public static void method(){
        System.out.println("default empty method");
    }

    //I will try to overload by changing the return type

//    public static int method(){
//        Changing return type does not work, just change the parameters.
//    }

    // We changed parameter, it is ok to do this.
    public static void method(int a){

    }
}
