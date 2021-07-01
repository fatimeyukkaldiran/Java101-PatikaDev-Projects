import java.util.Scanner;

public class Main {

    static void addition(){
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true){

            System.out.print("number " + i++ +" : " );
            number = sc.nextInt();
            if (number == 0)
                break;
            result += number;
        }
        System.out.println("result = " + result);

    }
    static  void subtraction(){
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true){

            System.out.print("number " + i++ +" : " );
            number = sc.nextInt();
            if (number == 0)
                break;
            result -= number;
        }
        System.out.println("result = " + result);
    }
    static  void multiplication(){
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true){

            System.out.print("number " + i++ +" : " );
            number = sc.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }else
                result *= number;
        }
        System.out.println("result = " + result);
    }
    static  void division(){
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true){

            System.out.print("number " + i++ +" : " );
            number = sc.nextInt();
            if (number == 0)
                break;
            result /= number;
        }
        System.out.println("result = " + result);
    }

    static  void exponent(){
        Scanner sc = new Scanner(System.in);
        int base, exp, result = 1;
        System.out.print("Input base:");
        base = sc.nextInt();
        System.out.print("Input exp:");
        exp = sc.nextInt();

        for (int i = 1; i <= exp; i++){
          result *= base;
        }

        System.out.println("result = " + result);
    }
    static  void factorial(){
        Scanner sc = new Scanner(System.in);
        int number, result = 1;

            System.out.print("number : ");
            number = sc.nextInt();
            if (number == 1)
                result = 1;
            else
           for (int i = number; i >= 1; i--){
               result *= i;
        }
        System.out.println("result = " + result);
    }
    static void mode(){
        Scanner sc = new Scanner(System.in);
        int num1, num2,result;
        System.out.print("Input num1:");
        num1 = sc.nextInt();
        System.out.print("Input num2:");
        num2 = sc.nextInt();
            result = num1%num2;
        System.out.println("result = " + result);
    }
    static void rectangularAreaPerimeter(){
        Scanner sc = new Scanner(System.in);
        int edge1, edge2, area, perimeter;
        System.out.print("Input edge1:");
        edge1 = sc.nextInt();
        System.out.print("Input edge2:");
        edge2 = sc.nextInt();

        perimeter = 2*(edge1+edge2);
        area = edge1*edge2;
        System.out.println("perimeter = " + perimeter + "\n" + "area = " + area);
    }

    public static void main(String[] args) {
        int select;
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.print("Input an operation \n 1- Addition \n 2- Subtraction\n 3- Multiplication \n 4- Division \n 5- Exponent Calculation \n " +
                    "6-Factorial Calculation \n 7- Mode Retrieval \n 8- Rectangular Area and Perimeter Calculation \n 0- exit \n operation : ");

            select = sc.nextInt();

            if (select == 0) {
                break;
            }

            switch (select){
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponent();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangularAreaPerimeter();
                    break;

                default:
                    System.out.println("Wrong select, input valid a selection!!");
            }

        }
        System.out.println("Exit is successful");
    }
}
