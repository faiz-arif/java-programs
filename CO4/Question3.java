package CO4;
import java.util.*;

class Validate{
    void validation(String user, String pass){
        if(!Objects.equals(user, "admin") || !Objects.equals(pass, "faiz")){
            try{
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("Invalid Credentials");
            }
        }
        else{
            System.out.println("Logged in successfully!!");
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String user = sc.nextLine();
        System.out.println("Enter the password: ");
        String pass = sc.next();
        Validate validate = new Validate();
        validate.validation(user,pass);
    }
}
