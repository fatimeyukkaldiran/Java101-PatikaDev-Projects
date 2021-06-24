import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result = 0;
        Scanner input = new Scanner(System.in)  ;

        System.out.print("Input number:");
        double n = input.nextInt();
        while (n > 0) {
            result += (1 / n);
            n--;
        }
        System.out.println(result);

     /* int number = input.nextInt();

        for (double i = 1; i <= number ; i++ ){
            result += (1/i);
        }
        System.out.println(result); */
    }
}
