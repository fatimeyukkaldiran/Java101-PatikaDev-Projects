import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base, exp, result = 1;
        Scanner input = new Scanner(System.in)  ;
        System.out.print("Input base :");
        base = input.nextInt();

        System.out.print("Input exponent :");
        exp = input.nextInt();

        for (int i = 1; i <= exp; i++){
            result *= base;
        }

        System.out.println(base +"^"+ exp + "=" +result);

    }

}
