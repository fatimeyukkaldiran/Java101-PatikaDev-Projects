import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Input a number:");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0){
                sum += number;
            }
        }while (number %2 ==0);

        System.out.println("Sum of multiple 4 and even numbers = " + sum);
    }
}
