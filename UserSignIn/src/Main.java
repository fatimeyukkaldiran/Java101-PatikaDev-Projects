import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer,USER_NAME = "FY2022" , PASSWORD = "noenter2022" ;
        Scanner input = new Scanner(System.in);

        System.out.print("Input user name :");
        USER_NAME = input.nextLine();
        System.out.print("Input password :");
        PASSWORD = input.nextLine();

        if (USER_NAME.equals("FY2022") && PASSWORD.equals("noenter2022"))
            System.out.println("Login successful");
        else {
            System.out.println("The username is wrong, do you want to reset your password?");
            System.out.print("answer:");
            answer = input.nextLine();
            if (answer.equals("yes")) {
                System.out.print("Enter new password :");
                PASSWORD = input.nextLine();
                if (PASSWORD.equals("noenter2022") || PASSWORD.length() < 6)
                    System.out.println("Could not create password, input new password !!");
                else
                    System.out.println("Could create password");
            } else
                System.out.println("Login not successful");
        }

    }
}
