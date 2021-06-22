import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int number, digitValue, sum = 0;

        Scanner input = new Scanner(System.in)  ;

        System.out.print("Input a number:");
        number = input.nextInt();

        while (number != 0){
            digitValue = number % 10;
            sum += digitValue;
            number /= 10;
            digitValue = 1;
        }
        System.out.println("sum of number digits = " + sum);
    }
}
