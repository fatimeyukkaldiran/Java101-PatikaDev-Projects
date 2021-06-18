import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operation , num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println(" \n 1:addition \n 2:multiplication \n 3:division");
        System.out.print("Input a operation: ");
        operation = input.nextInt();
        System.out.print("Input num1 :");
        num1 = input.nextInt();
        System.out.print("Input num2 :");
        num2 = input.nextInt();


        switch (operation) {
            case 1:
                System.out.println(num1 +" + " + num2 +" = " + num1+num2);
                break;

            case 2:
                System.out.println(num1 +" * " + num2 +" = " + num1*num2);
                break;
            case  3:
                System.out.println(num1 +" / " + num2 +" = " + num1/num2);
                break;
            default:
                System.out.println("Invalid operation, please input valid operation!");
        }

    }


}
