import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args) {
        String setUser = "solayman";
        String setPassword = "123456";
        
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.printf("Enter Your Username: ");
            String userName = input.nextLine();

            System.out.printf("Enter Your Password: ");
            String passWord = input.nextLine();

                if(userName.equals(setUser) && passWord.equals(setPassword)){
                    System.out.printf("Hello Buddy! Welcome to the System. \n");
                    break;
            } else{
                System.out.println("Username or Password is incorrect. Please try again.\n");
            }
        }  
    }
}