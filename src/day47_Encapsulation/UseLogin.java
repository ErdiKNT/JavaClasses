package day47_Encapsulation;

public class UseLogin {
    public static void main(String[] args) {
        Login obj = new Login();
//        obj.userName = "jamesBond";
//        obj.password = "1234";
        // We can not access private variables directly
        // We need to make getter and setter in the custom class in order to get private variables
        obj.setUserName("jamesBond");
        obj.setPassword("1234");

//        System.out.println(obj.userName);
//        System.out.println(obj.password);

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());// Password length is less than 8, it is null in here

        obj.setPassword("james0007bond"); // Now, we set new password, and it's length is more than 8
        System.out.println(obj.getPassword());
    }
}
