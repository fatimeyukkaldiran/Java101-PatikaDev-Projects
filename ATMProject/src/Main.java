import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int price = 0;
        int right = 3;
        int balance =1500;
        int select;
        Scanner input = new Scanner(System.in);


        while (right > 0){
            System.out.print("Input userName:");
            userName = input.nextLine();
            System.out.print("Input password:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("patika34")){
                System.out.println("Hello, welcome Kodluyoruz bank");

                do {
                    System.out.println("1-Investment \n" +
                            "2-Withdraw money \n" +
                            "3-balance inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select operation which want to make:");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Input price:");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Input price:");
                            price = input.nextInt();
                            if (price > balance)
                                System.out.println("Insufficient balance.");
                            else
                                balance -= price;
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                        default:
                            System.out.println("See you again.");
                            break;
                    }

                }while (select != 4);
                break;

            }else {
                System.out.println("Wrong user name or password, please try again");
                right--;
                if (right != 0){
                    System.out.println("your remaining right :" +right);
                }else
                    System.out.println("Your account is bloke, please contact with your bank. ");

            }
        }
    }
}