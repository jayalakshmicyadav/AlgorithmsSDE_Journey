import java.util.*;
public class Login
 {
    public static void main(String[] args)
    {  
        
       String username = "RDJ";
       String password = "RDJ@2004";
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter your username");
       String user = sc.next();
       System.out.println("Enter your password");
       String pass = sc.next();
       if(username.equals(user)  && password.equals(pass))
       {
        System.out.println("login");
       }
       else
       {
        System.out.println("Invalid credentials");
       }

    }
}