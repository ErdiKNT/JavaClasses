package day47_Encapsulation;

public class Login {

   private String userName;
   private String password;
  // In order to access private variables in different class we need getter and setters


    public void setUserName(String userName){
       this.userName = userName;
    }

    public void setPassword(String password){
        if(password.length() >=8){
            this.password = password;
        }
    }

    public String getUserName(){
          return  userName;
    }
    public String getPassword(){
        return password;
    }

}
