import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number:");
        int n = input.nextInt();
        int x = 0, y = 1, temp = 0;

        System.out.print(n +" Elements Fibonacci Series: " + x + " " + y);
        for (int i = 1; i < n; i++) {
            temp = x+y;
            x = y;
            y = temp;
            System.out.print(" " + temp);
        }

    }
}