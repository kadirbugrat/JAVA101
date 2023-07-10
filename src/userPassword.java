import java.util.Scanner;

public class userPassword {

    public static void main(String[] args) {

        String userName, password,NewPassword;

        String option;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the User Name: ");
        userName = input.nextLine();
        System.out.println("Enter the Password: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java101")){
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("Incorrect password or username");
            System.out.println("Do you want to reset your password? \n YES - NO");

            option = input.nextLine();

            if(option.equals("YES")){

                System.out.println("Enter the new password!");

                NewPassword = input.nextLine();

                if((NewPassword.equals("java101"))){
                    System.out.println("Your New Password can not be the same as the old one");
                }
                else {
                    password=NewPassword;
                    System.out.println("Your password has changed! --> "+ NewPassword);
                }
            }

            else if(option.equals("NO")) {
                System.out.println("Returning the Main Page!");
            }
            else{
                System.out.println("Opps! Something went wrong.");
            }

        }

    }
}
